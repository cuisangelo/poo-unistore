$(document).ready(function(){

    let filt = "";
    let ora;
    let v = false;
    var cnum = 13;

    $('.nor').hide();

    $("#buscador").bind('keypress', function(event) {
        var regex = new RegExp("^[a-zA-Z0-9 ]+$");
        var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
        if (!regex.test(key)) {
          event.preventDefault();
          return false;
        }
      });

      $("#buscador").keypress(function(event) {
        if (event.keyCode === 13) {
            $("#lupita").click();
        }
    });


    const removeAccents = (str) => {
        return str.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
      } 

    $('#lupita').click(function(){
        $('.nor').hide();
        filt = removeAccents(document.querySelector("#buscador").value.toLowerCase()).replace(/ /g,'');
        $('.curso').hide();

        for (let i=1; i<cnum+1; i++) {
            let clas = ".curso"+i;

            ora = removeAccents($(clas).text().toLowerCase()).replace(/ /g,'');

            if (ora.includes(filt)){
                $(clas).show();
                v = true;
            }
        }

        if (v == false){
            $('.nor').show(); 
        }
        v = false;
    });
});