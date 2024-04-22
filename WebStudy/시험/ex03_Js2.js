function hpy(){
    let num = Number(document.getElementById("txt").innerHTML.split(' ')[2])
    console.log(num+1)
    document.getElementById("txt").innerHTML = "Like! ♥ " + (num + 1)
}

function bad(){
    let num = Number(document.getElementById("txt").innerHTML.split(' ')[2])
    if(num<=0){
        Number(document.getElementById("txt").innerHTML.split(' ')[2])=0
    }else(
        document.getElementById("txt").innerHTML = "Like! ♥ " + (num -1 )
    )
}