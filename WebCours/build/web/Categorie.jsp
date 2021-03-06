<%-- 
    Document   : index
    Created on : Dec 20, 2018, 2:42:07 PM
    Author     : mst
--%>

<%@page import="Beans.Categorie"%>
<%@page import="Service.CategorieService"%>
<%@page import="Beans.Niveau"%>
<%@page import="Service.NiveauService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Purple Admin</title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="Template/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="Template/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- inject:css -->
        <link rel="stylesheet" href="Template/css/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="Template/images/favicon.png" />
        <script src="Script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="Script/moment.js" type="text/javascript"></script>
        <script src="Script/Categorie.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-scroller">
            <!-- partial:partials/_navbar.html -->
            <%@include file="header.jsp"%>
            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:partials/_sidebar.html -->
                <%@include file="menu.jsp" %>
                <!-- partial -->
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Ajouter une categorie</h4>

                                    <form class="forms-sample">
                                         <div class="form-group">
                    <input id="operation" type="hidden" name="operation" value="add" v="" />
                    </div>
                                        <div class="form-group">
                                            <label for="exampleInputName1">Libelle</label>
                                            <input type="text" class="form-control" id="libelle" name="libelle" placeholder="Libelle">
                                        </div>


                                        <button type="submit" id="save" class="btn btn-gradient-primary mr-2">Submit</button>
                                        <button class="btn btn-light">Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                        <!-- Tables  -->

                        <div class="col-lg-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Liste des Categories</h4>

                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th>
                                                    ID
                                                </th>
                                                <th>
                                                    LIBELLE
                                                </th>
                                                <th>
                                                    SUPPRIMER
                                                </th>
                                                <th>
                                                    MODIFIER
                                                </th>
                                            </tr>
                                        </thead>
                                        <tbody id="container">

                                            <%
                                                CategorieService ns = new CategorieService();
                                                for (Categorie n : ns.findAll()) {
                                            %>
                                            <tr>
                                                <td><%= n.getId()%></td>
                                                <td><%= n.getLibelle()%></td>

                                                <td><button id="delete" class="btn btn-outline-danger btn-fw" v="<%= n.getId()%>">Supprimer</button></td>
                                                <td><button id="update" class="btn btn-outline-success btn-fw" v="<%= n.getId()%>">Modifier</button></td>
                                            </tr>
                                            <% }%>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- Tables ends -->
                    </div>
                    <!-- content-wrapper ends -->
                    <!-- partial:partials/_footer.html -->
                    <footer class="footer">
                        <div class="d-sm-flex justify-content-center justify-content-sm-between">
                            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
                            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="mdi mdi-heart text-danger"></i></span>
                        </div>
                    </footer>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->

        <!-- plugins:js -->
        <script src="Template/vendors/js/vendor.bundle.base.js"></script>
        <script src="Template/vendors/js/vendor.bundle.addons.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page-->
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="Template/js/off-canvas.js"></script>
        <script src="Template/js/misc.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page-->
        <script src="Template/js/dashboard.js"></script>
        <!-- End custom js for this page-->
    </body>

</html>
