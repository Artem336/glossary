
window.onload=function() {

    var countWord = document.getElementsByClassName('trainword').length;
    var polosaLength = document.getElementById('polosaw');
    // polosaLength.style.width = countWord * 532 + 'px';
    polosaLength.style.width = countWord * 720 + 'px';
// document.getElementById('slider-left').onclick=sliderLeft;
//
// var left=0;
//
// function sliderLeft(){
//     var polosa=document.getElementById('polosa');
//
//     left=left-128;
//
//     if(left<-528){
//         left=0;
//     }
//     polosa.style.left=left+'px';
// }

    document.getElementById('slider-leftw').onclick = sliderLeftw;

    var leftw = 0;

    function sliderLeftw() {
        var polosaw = document.getElementById('polosaw');

        // leftw = leftw - 532;
        leftw = leftw - 720;

        /*change it   532*(n-2)    */
        if (leftw < -720 * (countWord - 2)) {
            // if(leftw<-1596){
            leftw = 0;
        }
        polosaw.style.left = leftw + 'px';
    }


    var testcase2 = document.getElementsByClassName('in2');
    var testout = document.getElementsByClassName('out');

    for(var i=0;i<testout.length;i++) {
        var t1;
        testcase2[i].onmousemove=function(event){
            t1=this;
            t1.style.height = 0+ 'px';
            console.log(this);

        }
        // testout[i].onmousemove=function(){
        //     this.firstElementChild.color="#4954fd";
        // console.log(this.firstElementChild);
        // }

        testout[i].onmouseleave = function (event) {
            t1.style.height = '512px';
            // textHide.style.color='rgba(0, 0, 0, 0)+""';
        }
}


}