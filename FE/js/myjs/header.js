$(document).ready(function (){
    $("#icon-darkmode").click(function (){
     $("#icon-lightmode").css("display","block");
     $("#icon-darkmode").css("display","none");
     $(".element-change").css("color","white");
     $(".element-change").css("background-color","black");
     $(".btn-changed").attr("class","btn btn-outline-primary me-2  btn-changed btn-changed-mode-dark btn-login");
     $(".icons-header").removeClass("icon-changed-mode-light");
     $(".icons-header").addClass("icon-changed-mode-dark");
    })
    $("#icon-lightmode").click(function (){
     $("#icon-darkmode").css("display","block");
     $("#icon-lightmode").css("display","none");
     $(".element-change").css("color","black");
     $(".element-change").css("background-color","white"); 
     $(".btn-changed").attr("class","btn btn-outline-primary me-2  btn-changed btn-changed-mode-light btn-login");
     $(".icons-header").removeClass("icon-changed-mode-dark");
     $(".icons-header").addClass("icon-changed-mode-light");
    })

   });