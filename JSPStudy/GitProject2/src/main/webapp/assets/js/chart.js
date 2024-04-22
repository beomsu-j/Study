$(function() {
	/* ChartJS
	 * -------
	 * Data and config for chartjs
	 */
	// 차트에 띄울 데이터 ajax로 가져오기
	let doughnutPieData = {};
	let doughnutPieOptions = {};
	let data = {};
	let multiLineData = {}; // 멀티라인 차트 데이터 변수 추가
	let options = {};

	$("#date_check").on("click", function() {
		let start_date = $("#dateFrom").val();
		let end_date = $("#dateTo").val();
		console.log(start_date);
		console.log(end_date);

		$.ajax({
			url: "SelectDate",
			data: { "start_date": start_date, "end_date": end_date },
			type: 'POST',
			dataType: 'json',
			success: (res) => {
				console.log("성공");
				// ex_category를 추출하여 labels 배열에 할당
				let labels = res.map(item => item.ex_category);

				// ex_count 값을 추출하여 data 배열에 할당
				let exCounts = res.map(item => item.ex_count);

				doughnutPieOptions = {
					responsive: true,
					animation: {
						maintainAspectRatio: false,
						cutoutPercentage: 70,
						animation: false,
						rotation: 1 * Math.PI,
						circumference: 1 * Math.PI
					}
				};

				doughnutPieData = {
					datasets: [{
						data: exCounts,
						backgroundColor: [
							'rgba(255, 99, 132, 0.5)',
							'rgba(54, 162, 235, 0.5)',
							'rgba(255, 206, 86, 0.5)',
							'rgba(75, 192, 192, 0.5)',
							'rgba(153, 102, 255, 0.5)',
							'rgba(255, 159, 64, 0.5)'
						],
						borderColor: [
							'rgba(255,99,132,1)',
							'rgba(54, 162, 235, 1)',
							'rgba(255, 206, 86, 1)',
							'rgba(75, 192, 192, 1)',
							'rgba(153, 102, 255, 1)',
							'rgba(255, 159, 64, 1)'
						],
					}],

					labels: labels
				};
				if ($("#doughnutChart").length) {
					var doughnutChartCanvas = $("#doughnutChart").get(0).getContext("2d");
					var doughnutChart = new Chart(doughnutChartCanvas, {
						type: 'doughnut',
						data: doughnutPieData,
						options: doughnutPieOptions
					});
				}

				if ($("#pieChart").length) {
					var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
					var pieChart = new Chart(pieChartCanvas, {
						type: 'pie',
						data: doughnutPieData,
						options: doughnutPieOptions
					});
				}

			},
			error: () => {
				console.log("실패")
			}
		})

	});






	$("#date_check").on("click", function() {
		let start_date = $("#dateFrom").val();
		let end_date = $("#dateTo").val();
		console.log(start_date);
		console.log(end_date);

		$.ajax({
			url: "Acc_Ch",
			data: { "start_date": start_date, "end_date": end_date },
			type: 'POST',
			dataType: 'json',
			success: (res) => {
				console.log("성공");
				let labels = res.map(item => item.ch_date);
				let exCalories = res.map(item => item.ex_calories); // 수정된 변수명
				let bmi = res.map(item => item.bmi);
				let muscle = res.map(item => item.muscle);
				let fat_per = res.map(item => item.fat_per); // 수정

				data = {

					datasets: [{

						data: exCalories,
						backgroundColor: [
							'rgba(255, 99, 132, 0.2)',
							'rgba(54, 162, 235, 0.2)',
							'rgba(255, 206, 86, 0.2)',
							'rgba(75, 192, 192, 0.2)',
							'rgba(153, 102, 255, 0.2)',
							'rgba(255, 159, 64, 0.2)'
						],
						borderColor: [
							'rgba(255,99,132,1)',
							'rgba(54, 162, 235, 1)',
							'rgba(255, 206, 86, 1)',
							'rgba(75, 192, 192, 1)',
							'rgba(153, 102, 255, 1)',
							'rgba(255, 159, 64, 1)'
						],
						borderWidth: 1,
						fill: false
					}],
					labels: labels
				};
				multiLineData = {

					datasets: [{
						label: 'Ex Calories', // 수정된 라벨
						data: exCalories, // 수정된 변수명
						borderColor: '#587ce4', // 수정된 색상
						borderWidth: 2,
						fill: false
					},
					{
						label: 'BMI',
						data: bmi,
						borderColor: '#ede190',
						borderWidth: 2,
						fill: false
					},
					{
						label: 'Muscle',
						data: muscle,
						borderColor: '#f44252',
						borderWidth: 2,
						fill: false
					},
					{
						label: 'Fat Percentage', // 수정된 라벨
						data: fat_per, // 수정된 변수명
						borderColor: '#f442',
						borderWidth: 2,
						fill: false
					}],
					labels: labels
				};
				if ($("#barChart").length) {
					var barChartCanvas = $("#barChart").get(0).getContext("2d");
					// This will get the first returned node in the jQuery collection.
					var barChart = new Chart(barChartCanvas, {
						type: 'bar',
						data: data,
						options: options
					});

				}
				if ($("#lineChart").length) {
					var lineChartCanvas = $("#lineChart").get(0).getContext("2d");
					var lineChart = new Chart(lineChartCanvas, {
						type: 'line',
						data: data,
						options: options
					});
				}
				if ($("#linechart-multi").length) {
					var multiLineCanvas = $("#linechart-multi").get(0).getContext("2d");
					var lineChart = new Chart(multiLineCanvas, {
						type: 'line',
						data: multiLineData,
						options: options
					});
				}
				options = {
					scales: {
						yAxes: [{
							ticks: {
								beginAtZero: true
							}
						}]
					},
					legend: {
						display: false
					},
					elements: {
						point: {
							radius: 0
						}
					}

				};
			},
			error: () => {
				console.log("실패")
			}
		})
	});


	/////////////////////////////////////////////////////////////////////////////////////



	$("#Month_check").on("click", function() {
		let start_date = $("#dateFrom").val();
		let end_date = $("#dateTo").val();
		console.log(start_date);
		console.log(end_date);

		$.ajax({
			url: "AttRate",
			data: { "start_date": start_date, "end_date": end_date },
			type: 'POST',
			dataType: 'json',
			success: (res) => {
				console.log("성공");
				// ex_category를 추출하여 labels 배열에 할당
				let labels = res.map(item => item.ch_date);

				// ex_count 값을 추출하여 data 배열에 할당
				let dates = res.map(item => item.ch_date);

				doughnutPieOptions = {
					responsive: true,
					animation: {
						maintainAspectRatio: false,
						cutoutPercentage: 70,
						animation: false,
						rotation: 1 * Math.PI,
						circumference: 1 * Math.PI
					}
				};

				doughnutPieData = {
					datasets: [{
						data: dates,
						backgroundColor: [
							'rgba(255, 99, 132, 0.5)',
							'rgba(54, 162, 235, 0.5)',
							'rgba(255, 206, 86, 0.5)',
							'rgba(75, 192, 192, 0.5)',
							'rgba(153, 102, 255, 0.5)',
							'rgba(255, 159, 64, 0.5)'
						],
						borderColor: [
							'rgba(255,99,132,1)',
							'rgba(54, 162, 235, 1)',
							'rgba(255, 206, 86, 1)',
							'rgba(75, 192, 192, 1)',
							'rgba(153, 102, 255, 1)',
							'rgba(255, 159, 64, 1)'
						],
					}],

					labels: labels
				};
				if ($("#doughnutChart").length) {
					var doughnutChartCanvas = $("#doughnutChart").get(0).getContext("2d");
					var doughnutChart = new Chart(doughnutChartCanvas, {
						type: 'doughnut',
						data: doughnutPieData,
						options: doughnutPieOptions
					});
				}

				if ($("#pieChart").length) {
					var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
					var pieChart = new Chart(pieChartCanvas, {
						type: 'pie',
						data: doughnutPieData,
						options: doughnutPieOptions
					});
				}

			},
			error: () => {
				console.log("실패")
			}
		})

	});













	'use strict';
	
	var dataDark = {
		labels: ["2013", "2014", "2014", "2015", "2016", "2017"],
		datasets: [{
			label: '# of Votes',
			data: [10, 19, 3, 5, 2, 3],
			backgroundColor: [
				'rgba(255, 99, 132, 0.2)',
				'rgba(54, 162, 235, 0.2)',
				'rgba(255, 206, 86, 0.2)',
				'rgba(75, 192, 192, 0.2)',
				'rgba(153, 102, 255, 0.2)',
				'rgba(255, 159, 64, 0.2)'
			],
			borderColor: [
				'rgba(255,99,132,1)',
				'rgba(54, 162, 235, 1)',
				'rgba(255, 206, 86, 1)',
				'rgba(75, 192, 192, 1)',
				'rgba(153, 102, 255, 1)',
				'rgba(255, 159, 64, 1)'
			],
			borderWidth: 1,
			fill: false
		}]
	};
	
	
	
	var optionsDark = {
		scales: {
			yAxes: [{
				ticks: {
					beginAtZero: true
				},
				gridLines: {
					color: '#322f2f',
					zeroLineColor: '#322f2f'
				}
			}],
			xAxes: [{
				ticks: {
					beginAtZero: true
				},
				gridLines: {
					color: '#322f2f',
				}
			}],
		},
		legend: {
			display: false
		},
		elements: {
			point: {
				radius: 0
			}
		}

	};

	var areaData = {
		labels: ["2013", "2014", "2015", "2016", "2017"],
		datasets: [{
			label: '# of Votes',
			data: [12, 19, 3, 5, 2, 3],
			backgroundColor: [
				'rgba(255, 99, 132, 0.2)',
				'rgba(54, 162, 235, 0.2)',
				'rgba(255, 206, 86, 0.2)',
				'rgba(75, 192, 192, 0.2)',
				'rgba(153, 102, 255, 0.2)',
				'rgba(255, 159, 64, 0.2)'
			],
			borderColor: [
				'rgba(255,99,132,1)',
				'rgba(54, 162, 235, 1)',
				'rgba(255, 206, 86, 1)',
				'rgba(75, 192, 192, 1)',
				'rgba(153, 102, 255, 1)',
				'rgba(255, 159, 64, 1)'
			],
			borderWidth: 1,
			fill: true, // 3: no fill
		}]
	};

	var areaDataDark = {
		labels: ["2013", "2014", "2015", "2016", "2017"],
		datasets: [{
			label: '# of Votes',
			data: [12, 19, 3, 5, 2, 3],
			backgroundColor: [
				'rgba(255, 99, 132, 0.2)',
				'rgba(54, 162, 235, 0.2)',
				'rgba(255, 206, 86, 0.2)',
				'rgba(75, 192, 192, 0.2)',
				'rgba(153, 102, 255, 0.2)',
				'rgba(255, 159, 64, 0.2)'
			],
			borderColor: [
				'rgba(255,99,132,1)',
				'rgba(54, 162, 235, 1)',
				'rgba(255, 206, 86, 1)',
				'rgba(75, 192, 192, 1)',
				'rgba(153, 102, 255, 1)',
				'rgba(255, 159, 64, 1)'
			],
			borderWidth: 1,
			fill: true, // 3: no fill
		}]
	};

	var areaOptions = {
		plugins: {
			filler: {
				propagate: true
			}
		}
	}

	var areaOptionsDark = {
		scales: {
			yAxes: [{
				ticks: {
					beginAtZero: true
				},
				gridLines: {
					color: '#322f2f',
					zeroLineColor: '#322f2f'
				}
			}],
			xAxes: [{
				ticks: {
					beginAtZero: true
				},
				gridLines: {
					color: '#322f2f',
				}
			}],
		},
		plugins: {
			filler: {
				propagate: true
			}
		}
	}

	var multiAreaData = {
		labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
		datasets: [{
			label: 'Facebook',
			data: [8, 11, 13, 15, 12, 13, 16, 15, 13, 19, 11, 14],
			borderColor: ['rgba(255, 99, 132, 0.5)'],
			backgroundColor: ['rgba(255, 99, 132, 0.5)'],
			borderWidth: 1,
			fill: true
		},
		{
			label: 'Twitter',
			data: [7, 17, 12, 16, 14, 18, 16, 12, 15, 11, 13, 9],
			borderColor: ['rgba(54, 162, 235, 0.5)'],
			backgroundColor: ['rgba(54, 162, 235, 0.5)'],
			borderWidth: 1,
			fill: true
		},
		{
			label: 'Linkedin',
			data: [6, 14, 16, 20, 12, 18, 15, 12, 17, 19, 15, 11],
			borderColor: ['rgba(255, 206, 86, 0.5)'],
			backgroundColor: ['rgba(255, 206, 86, 0.5)'],
			borderWidth: 1,
			fill: true
		}
		]
	};

	var multiAreaOptions = {
		plugins: {
			filler: {
				propagate: true
			}
		},
		elements: {
			point: {
				radius: 0
			}
		},
		scales: {
			xAxes: [{
				gridLines: {
					display: false
				}
			}],
			yAxes: [{
				gridLines: {
					display: false
				}
			}]
		}
	}

	var scatterChartData = {
		datasets: [{
			label: 'First Dataset',
			data: [{
				x: -10,
				y: 0
			},
			{
				x: 0,
				y: 3
			},
			{
				x: -25,
				y: 5
			},
			{
				x: 40,
				y: 5
			}
			],
			backgroundColor: [
				'rgba(255, 99, 132, 0.2)'
			],
			borderColor: [
				'rgba(255,99,132,1)'
			],
			borderWidth: 1
		},
		{
			label: 'Second Dataset',
			data: [{
				x: 10,
				y: 5
			},
			{
				x: 20,
				y: -30
			},
			{
				x: -25,
				y: 15
			},
			{
				x: -10,
				y: 5
			}
			],
			backgroundColor: [
				'rgba(54, 162, 235, 0.2)',
			],
			borderColor: [
				'rgba(54, 162, 235, 1)',
			],
			borderWidth: 1
		}
		]
	}

	var scatterChartDataDark = {
		datasets: [{
			label: 'First Dataset',
			data: [{
				x: -10,
				y: 0
			},
			{
				x: 0,
				y: 3
			},
			{
				x: -25,
				y: 5
			},
			{
				x: 40,
				y: 5
			}
			],
			backgroundColor: [
				'rgba(255, 99, 132, 0.2)'
			],
			borderColor: [
				'rgba(255,99,132,1)'
			],
			borderWidth: 1
		},
		{
			label: 'Second Dataset',
			data: [{
				x: 10,
				y: 5
			},
			{
				x: 20,
				y: -30
			},
			{
				x: -25,
				y: 15
			},
			{
				x: -10,
				y: 5
			}
			],
			backgroundColor: [
				'rgba(54, 162, 235, 0.2)',
			],
			borderColor: [
				'rgba(54, 162, 235, 1)',
			],
			borderWidth: 1
		}
		]
	}

	var scatterChartOptions = {
		scales: {
			xAxes: [{
				type: 'linear',
				position: 'bottom'
			}]
		}
	}

	var scatterChartOptionsDark = {
		scales: {
			xAxes: [{
				type: 'linear',
				position: 'bottom',
				gridLines: {
					color: '#322f2f',
					zeroLineColor: '#322f2f'
				}
			}],
			yAxes: [{
				gridLines: {
					color: '#322f2f',
					zeroLineColor: '#322f2f'
				}
			}]
		}
	}
	// Get context with jQuery - using jQuery's .get() method.
	

	if ($("#barChartDark").length) {
		var barChartCanvasDark = $("#barChartDark").get(0).getContext("2d");
		// This will get the first returned node in the jQuery collection.
		var barChartDark = new Chart(barChartCanvasDark, {
			type: 'bar',
			data: dataDark,
			options: optionsDark
		});
	}

	

	if ($("#lineChartDark").length) {
		var lineChartCanvasDark = $("#lineChartDark").get(0).getContext("2d");
		var lineChartDark = new Chart(lineChartCanvasDark, {
			type: 'line',
			data: dataDark,
			options: optionsDark
		});
	}

	if ($("#linechart-multi").length) {
		var multiLineCanvas = $("#linechart-multi").get(0).getContext("2d");
		var lineChart = new Chart(multiLineCanvas, {
			type: 'line',
			data: multiLineData,
			options: options
		});
	}

	if ($("#areachart-multi").length) {
		var multiAreaCanvas = $("#areachart-multi").get(0).getContext("2d");
		var multiAreaChart = new Chart(multiAreaCanvas, {
			type: 'line',
			data: multiAreaData,
			options: multiAreaOptions
		});
	}

	if ($("#areaChart").length) {
		var areaChartCanvas = $("#areaChart").get(0).getContext("2d");
		var areaChart = new Chart(areaChartCanvas, {
			type: 'line',
			data: areaData,
			options: areaOptions
		});
	}

	if ($("#areaChartDark").length) {
		var areaChartCanvas = $("#areaChartDark").get(0).getContext("2d");
		var areaChart = new Chart(areaChartCanvas, {
			type: 'line',
			data: areaDataDark,
			options: areaOptionsDark
		});
	}

	if ($("#scatterChart").length) {
		var scatterChartCanvas = $("#scatterChart").get(0).getContext("2d");
		var scatterChart = new Chart(scatterChartCanvas, {
			type: 'scatter',
			data: scatterChartData,
			options: scatterChartOptions
		});
	}

	if ($("#scatterChartDark").length) {
		var scatterChartCanvas = $("#scatterChartDark").get(0).getContext("2d");
		var scatterChart = new Chart(scatterChartCanvas, {
			type: 'scatter',
			data: scatterChartDataDark,
			options: scatterChartOptionsDark
		});
	}

	if ($("#browserTrafficChart").length) {
		var doughnutChartCanvas = $("#browserTrafficChart").get(0).getContext("2d");
		var doughnutChart = new Chart(doughnutChartCanvas, {
			type: 'doughnut',
			data: browserTrafficData,
			options: doughnutPieOptions
		});
	}
});