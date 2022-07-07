$(document).ready(function(){
    var index = sessionStorage.getItem('sty');
    var col = sessionStorage.getItem('cl');

    var img = ["imagenes/Cálculo Diferencial.png","imagenes/Geometría Analítica.png",
    "imagenes/Introducción a la computación.png","imagenes/Introducción al pensamiento y la ingeniería de sistemas.png",
    "imagenes/Química.png","imagenes/Redacción y Comunicación.png","imagenes/Cálculo Integral.png",
    "imagenes/Algoritmia y Estructura de Datos.png","imagenes/Álgebra Lineal.png","imagenes/Ética y Filosofía Política.png",
    "imagenes/Sistemas Biológicos y Ecológicos.png","imagenes/Psicología Sistemática.png",
    "imagenes/Teoría y Ciencia de Sistemas.png"];

    $("#lupita2").hover(
        function() {
          $(this).css('color', col);
        }, function() {
          $(this).css('color','rgb(16, 3, 27)');
        }
      );

      $("#sublista").css('background-color', col);
      $(".iconame").css('color', col);

     $(".icons").hover(
        function() {
          $(this).css('color', col);
        }, function() {
          $(this).css('color','aliceblue');
        }
      );

      $("#sublista div").hover(
        function() {
          $(this).css('color', col);
        }, function() {
          $(this).css('color','aliceblue');
        }
      );

    $('#logo img').attr("src",img[index]);
    $('.c').css('background', col);
});