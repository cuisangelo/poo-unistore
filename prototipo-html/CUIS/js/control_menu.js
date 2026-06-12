$(document).ready(function () {
    $("#sublista").hide();

    $("#sublista div:nth-child(0)").css('overflow',"hidden");

    $(".menu:nth-child(3)").click(function () {
        $("#sublista").show();
    });

    $(".menu:nth-child(3)").hover(
        function () {}, function () {
            $("#sublista").hide();
        }
    );

    $(".menu:nth-child(5)").hover(
        function () {
            $(".menu:nth-child(5) .iconame").css({"transform": "translate(0px,-50px)"});
        }, function ()  {
            $(".menu:nth-child(5) .iconame").css({"transform": "translate(0px,50px)"});
        }
    );

    $(".menu:nth-child(6)").hover(
        function () {
            $(".menu:nth-child(6) .iconame").css({"transform": "translate(0px,-50px)"});
        }, function ()  {
            $(".menu:nth-child(6) .iconame").css({"transform": "translate(0px,50px)"});   
        }
    );

    $("#sublista").hover(
        function () {
            $("#sublista").show();
        }, function () {
            $("#sublista").hide();
        }
    );

    /*$("#sublista div").hover(
        function () {
            $("#sublista").show();
        }, function () {
            $("#sublista").hide();
        }
    );*/
});