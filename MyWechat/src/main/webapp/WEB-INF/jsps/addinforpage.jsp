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
    <link rel='stylesheet' type='text/css' media='screen' href='../css/mycss/addinforpage.css'>
    <script src="../js/jquery/jQuery.js"></script>
    <script src="../js/flatpickjs/flatpickr.min.js"></script>
	
	
</head>

<body cz-shortcut-listen="true">
    <div class="py-5 text-center">

        <h2>Thêm thông tin cơ bản</h2>
        <p class="lead">Thêm những thông tin cơ bản của bạn để dễ dàng kết nối với mọi người !</p>
        <p class="lead btn-light"><a href="#">Bỏ qua</a></p>
    </div>
    <div class="div-infoBasicUser">

        <form class="needs-validation" novalidate="">
            <div class="row g-3">
                <div class="col-sm-6">
                    <label for="lastName" class="form-label">Họ</label>
                    <input type="text" class="form-control" id="lastName" placeholder="" value="" required=""
                        fdprocessedid="xj3wn">
                    <div class="invalid-feedback">
                        Valid last name is required.
                    </div>
                </div>

                <div class="col-sm-6">
                    <label for="firstName" class="form-label">Tên</label>
                    <input type="text" class="form-control" id="firstName" placeholder="" value="" required=""
                        fdprocessedid="62vt98">
                    <div class="invalid-feedback">
                        Valid first name is required.
                    </div>
                </div>

                <div class="col-12">
                    <label for="username" class="form-label">Tên đăng nhập</label>
                    <input type="text" class="form-control" id="username" placeholder="" value="" required=""
                        fdprocessedid="xj3wn">
                    <div class="invalid-feedback">
                        Valid last name is required.
                    </div>
                </div>
                <div class="d-flex">
                    <div class="col-6">
                        <label for="gender" class="form-label">Giới tính</label>
                        <div class="my-3">
                            <div class="form-check">
                                <input id="boy" name="gender" type="radio" class="form-check-input" checked=""
                                    required="">
                                <label class="form-check-label" for="boy">Nam</label>
                            </div>
                            <div class="form-check">
                                <input id="girl" name="gender" type="radio" class="form-check-input" required="">
                                <label class="form-check-label" for="girl">Nữ</label>
                            </div>
                            <div class="form-check">
                                <input id="other" name="gender" type="radio" class="form-check-input" required="">
                                <label class="form-check-label" for="other">Khác</label>
                            </div>
                        </div>
                    </div>
                    <div class="col-6 ">
                        <label for="birthday" class="form-label">Ngày sinh</label>
                        <input id="birthday" class="birthday-input" type="date" >
                        <div class="invalid-feedback">
                            Please select a valid country.
                        </div>
                    </div>
                </div>
                <div class="mb-3">
                    <label for="formFile" class="form-label">Ảnh đại diện</label>
                    <input class="form-control" type="file" id="formFile">
                </div>

                <div class="col-12">
                    <label for="address" class="form-label">Quê quán</label>
                    <input type="text" class="form-control" id="address" placeholder="" required=""
                        fdprocessedid="7u7oj">
                    <div class="invalid-feedback">
                        Please enter your shipping address.
                    </div>
                </div>

                <div class="col-12">
                    <label for="address2" class="form-label">Nơi ở hiện tại</label>
                    <input type="text" class="form-control" id="address2" placeholder=""
                        fdprocessedid="foenn">
                </div>

                <button class="w-100 btn btn-primary btn-lg" type="submit" fdprocessedid="lnkopv">Đăng ký thông
                    tin</button>
        </form>
    </div>
	
    
</body>

</html>