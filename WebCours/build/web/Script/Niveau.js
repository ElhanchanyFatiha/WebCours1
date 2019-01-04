$(document).ready(function () {
      $('#container').on('click', '#update', function () {
        var id = $(this).attr("v");
        $.ajax({
            url: "LoadNiveau",
            type: 'GET',
            data: {id: id},
            success: function (data) {
                $("#libelle").val(data.libelle);
                
                $("#save").html("Modifier");
                $("#operation").val("update");
                $("#operation").attr("v", id);
            },
            error: function (errorThrown) {
                console.log("erreur");
            }
        });
    });
    
 
    $('#container').on('click', '#delete', function () {
        var id = $(this).attr("v");
        if (confirm("Voulez-vous Vraiement supprimer ce Niveau ?")) {
            $.ajax({
                url: "DeleteNiveau",
                type: 'GET',
                cache: false,
                data: {id: id},
                success: function (data) {
                    $("#container").empty();
                    $("#container").html(remplir(data));
                },
                error: function (errorThrown) {
                    console.log("erreur");
                }
            });
            return true;
        } else {
            return false;
        }
    });
    
    $("#save").click(function () {
        var libelle = $("#libelle").val();
        var operation = $("#operation").val();
        var id = $("#operation").attr("v");
        $.ajax({
            url: "AddNiveau",
            type: 'GET',
            data: {libelle: libelle, operation: operation, id: id},
            success: function (data) {
                init(); //vider les champs 
                $("#container").empty(); //vider le tableau
                $("#container").html(remplir(data)); // remplir le tableau
                $("#save").html("Ajouter");
            },
            error: function (errorThrown) {
                console.log("erreur");
            }
        });
    });

    function init() {
        $("#libelle").val("");
       
    }

     function remplir(data) {
        var ligne = "";
        for (i = 0; i < data.length; i++) {
            ligne += '<tr><td>' + data[i].id + '</td><td>' + data[i].libelle + '</td><td><button id="delete" v="' + data[i].id + '">Supprimer</button></td><td><button id="update" v="' + data[i].id + '">Modifier</button></td></tr>';
        }
        return ligne;
    }
});


