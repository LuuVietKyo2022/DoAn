<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Wechat</title>
	<link rel="icon" href="..\images\icon-tab\favicon2.png" type="image/png" >
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap-5.3.2-dist/css/bootstrap.min.css'>
    <link rel="stylesheet" type="text/css"
        href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel='stylesheet' type='text/css' media='screen' href='../css/mycss/registerpage.css'>
    <script src="jquery-3.7.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>

</head>

<body>
    <div class="d-flex">
    <div class="div-logo d-flex">
        <i class="bi bi-chat icon-logo "></i>
        <h1 class="">Wechat</h1>
        
    </div>
    <form class="form-register">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email</label>
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">Không nên chia sẻ thông tin tài khoản</div>
        </div>
        <div class="mb-1">
            <label for="exampleInputPassword1" class="form-label">Mật khẩu</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
            <i id="btn-showpass" onclick="showOrHidePass()" class="bi bi-eye-slash-fill"></i>
        </div>
        <div class="mb-1">
            <label for="exampleInputPassword1" class="form-label">Nhập lại Mật khẩu</label>
            <input type="password" class="form-control" id="exampleInputPassword2">
            <i id="btn-showpass2" onclick="showOrHidePass2()" class="bi bi-eye-slash-fill"></i>
        </div>
        <button type="submit" class="btn btn-primary">Đăng ký</button>
        <p class="mt-5 mb-3 text-body-secondary">Bạn đã có tài khoản hãy <a href="/login">đăng nhập</a> nhé !</p>
    </form>
    </div>
    <script src="../js/myjs/registerpage.js"></script>
</body>

</html>