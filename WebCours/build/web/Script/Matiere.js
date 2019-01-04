$(document).ready(function () {
      $('#container').on('click', '#update', function () {
        var id = $(this).attr("v");
        $.ajax({
            url: "LoadMatiere",
            type: 'GET',
            data: {id: id},
            success: function (data) {
                $("#nom").val(data.nom);
                
                $("#niveau").val(data.niveau.id);
                $("#categorie").val(data.categorie.id);
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
        if (confirm("Voulez-vous Vraiement supprimer cette Matiere ?")) {
            $.ajax({
                url: "DeleteMatiere",
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
        var nom = $("#nom").val();
        
        var niveau = $("#niveau").val();
        
        var categorie = $("#categorie").val();
        var operation = $("#operation").val();
        var id = $("#operation").attr("v");
        $.ajax({
            url: "AddMatiere",
            type: 'GET',
            data: {nom: nom,niveau:niveau,categorie: categorie, operation: operation, id: id},
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
        $("#nom").val("");
        $("#niveau").val("");
        $("#categorie").val("");
       
    }

 function remplir(data) {
//        console.log("remplir"+ data);
        var ligne = "";
        for (i = 0; i < data.length; i++) {
            ligne += '<tr><td>' + data[i].id + '</td><td>' + data[i].nom + '</td><td>' + data[i].niveau.libelle + '</td><td>' + data[i].categorie.libelle + '</td><td><button id="delete" v="' + data[i].id + '">Supprimer</button></td><td><button id="update" v="' + data[i].id + '">Modifier</button></td></tr>';
        }
        return ligne;
    }
});


