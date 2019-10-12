window.onload=function(){


    function listShow() {
        // alert('test');
        //         // add.style.display='none';
        //         // h.style.display='inline';
        //         // list.style.display='inline';
add.setAttribute("hidden","");
h.style.display='block';
list.style.display='block';
    }

    var show=document.getElementById('showList').onclick=listShow;
    var list=document.getElementById('list');
    var h=document.getElementById('listWords');
    var add=document.getElementById('add');
    // h.setAttribute("hidden","");
    // list.setAttribute("hidden","");


}