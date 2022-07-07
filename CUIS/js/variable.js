$(document).ready(function(){
    $('.link').click(function(){
        sessionStorage.setItem('sty',$(this).index());
        sessionStorage.setItem('cl',$(this).attr("color"));
    });
});