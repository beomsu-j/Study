
//2번버튼
document.getElementById('btn2').addEventListener('click', function() {
    var divs = document.querySelectorAll('div');
    divs.forEach(function(div) {
        div.style.borderTopRightRadius = '50%';
        div.style.borderBottomLeftRadius = '50%';


    });
});