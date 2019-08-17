
window.onload=function(){

    var countWord= document.getElementsByClassName('trainword').length;
    var polosaLength=document.getElementById('polosaw');
    polosaLength.style.width=countWord*532+'px';
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

    document.getElementById('slider-leftw').onclick=sliderLeftw;

    var leftw=0;

    function sliderLeftw(){
        var polosaw=document.getElementById('polosaw');

        leftw=leftw-532;

        /*change it   532*(n-2)    */
        if(leftw<-532*(countWord-2)){
        // if(leftw<-1596){
            leftw=0;
        }
        polosaw.style.left=leftw+'px';
    }



}