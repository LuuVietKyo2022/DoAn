<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Wechat</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='../css/bootstrap-5.3.2-dist/css/bootstrap.min.css'>
    <link rel="stylesheet" type="text/css"
        href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel='stylesheet' type='text/css' media='screen' href='../css/mycss/homepage.css'>
    <script src="jquery-3.7.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>

</head>

<body>
    <div class="firstchild-body">

        <div
            class="header d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
            <div class="col-md-3 mb-2 mb-md-0">
                <a href="/" class="d-inline-flex link-body-emphasis text-decoration-none">
                    <div class="div-logo">
                        <i class="bi bi-chat icon-logo "></i>
                        <h1 class="">Wechat</h1>
                    </div>
                </a>

            </div>

            <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/home" class="nav-link px-2 "><i
                            class="bi bi-house-heart icons-header  "></i></a></li>
                <li><a href="#" class="nav-link px-2 "><i class="bi bi-people  icons-header "></i></a></li>
                <li id="li-chat" onclick="showListMessages()"><a href="#" class="nav-link px-2 "><i class="bi bi-chat icons-header  "></i></a></li>
                <li><a href=""   class="nav-link px-2 "><i class="bi bi-play-btn icons-header  "></i></a></li>
                <li><a href="#" class="nav-link px-2 "><i class="bi bi-bell icons-header "></i></a></li>
                <li><a href="#" class="nav-link px-2 "><i class="bi bi-gear icons-header  "></i></a></li>
                <li></li>
            </ul>

            <div class="col-md-3 text-end">
                <a href="/login" type="button" class="btn btn-outline-primary btn-logout  ">Đăng xuất</a>
               
            </div>
        </div>

        <div class="leftnavigation">
            <div class="div-flex">
                <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                    <input type="search" class="form-control " placeholder="Tìm..." aria-label="Search">
                </form>
                <div class="dropdown text-end">
                    <a href="/personal" class="d-block link-body-emphasis text-decoration-none ">
                        <img src="https://github.com/mdo.png" alt="mdo" width="32" height="32" class="rounded-circle">
                    </a>
                </div>
            </div>
            <ul class="nav ul-leftnavi ul-margin nav-pills flex-column ">

                <li>
                    <a href="#" class="nav-link link-body-emphasis a-flex">
                        <i class="bi  icon-nav bi-person"></i>
                        <p class="p-functionnav">Bạn bè</p>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link   link-body-emphasis a-flex">
                        <i class="bi  icon-nav bi-people"></i>
                        <p class="p-functionnav">Nhóm</p>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link  link-body-emphasis a-flex">
                        <i class="bi   icon-nav bi-clock-history"></i>
                        <p class="p-functionnav">Kỉ niệm</p>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link   link-body-emphasis a-flex">
                        <i class="bi   icon-nav bi-bookmark"></i>
                        <p class="p-functionnav">Đã lưu</p>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link  link-body-emphasis a-flex">
                        <i class="bi  icon-nav bi-play-btn"></i>
                        <p class="p-functionnav">Video</p>
                    </a>
                </li>
            </ul>

        </div>
        <div class="rightnavigation d-flex flex-column flex-md-row align-items-center justify-content-center">
            <div class="list-group">
                <h3 class="title-rightnavi">Lời mời kết bạn</h3>
                <div>
                    <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                        <img src="https://github.com/mdo.png" alt="mdo" width="60" height="60" class="rounded-circle">
                        <h4 class="mb-0">Thảo</h4>
                        <small class="opacity-50 text-nowrap">now</small>
                    </a>
                    <div class="d-flex flex-row">
                        <button type="button" id="btn-accept" class="btn btn-primary btn-friend">Đồng ý</button>
                        <button type="button" class="btn btn-light btn-friend">Xóa</button>
                    </div>
                </div>

                <h3 class="title-rightnavi">Sinh nhật</h3>
                <div class="list-group-item">
                    <i class="bi bi-gift" style="font-size: 40px;"></i>
                    <p>Hôm nay là sinh nhật của <a class="a-birtday" href="#">Tiểu Hồng</a> và <a class="a-birtday"
                            href="#">5 người khác </a>hãy chúc mừng họ</p>
                </div>


            </div>
        </div>
        <div class="statusForm">
            <div class="modal fade  modal-sheet  bg-body-secondary p-4 py-md-5" id="modal-createstatus" tabindex="-1"
                style="display: none ;" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content rounded-4 shadow">
                        <div class="modal-body p-4">
                            <h2 class="fw-bold mb-0">Tạo bài viết</h2>
                            <div class="form-floating mb-3">
                                <input type="text" style="height: 120px;" class="form-control rounded-3"
                                    id="floatingInput" placeholder="" fdprocessedid="h0hky">
                                <label for="floatingInput">Bạn đang nghĩ gì thế ?</label>
                            </div>

                            <ul class="d-grid d-flex flex-row gap-4 my-5 list-unstyled small">
                                <li class="gap-4 status-icons">
                                    <i class="bi bi-image"></i>
                                </li>
                                <li class="gap-4 status-icons">
                                    <i class="bi bi-person-fill-add"></i>
                                </li>
                                <li class="gap-4 status-icons">
                                    <i class="bi bi-emoji-smile"></i>
                                </li>
                                <li class="gap-4 status-icons">
                                    <i class="bi bi-geo-alt"></i>
                                </li>
                            </ul>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-lg btn-primary mt-5 w-100" id="btn-close-createstatus"
                                data-dismiss="modal">Đăng</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="list-card">
            <div class="card card-status d-flex flex-row">

                <div class=" d-flex flex-row card-body card-body-avatar">
                    <a href="/home">
                        <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                            class="img-miniavatar rounded-circle">
                    </a>

                    <input type="text" class="form-control inputstatus" data-bs-toggle="modal"
                        data-bs-target="#modal-createstatus" id="inputCreateStatus"
                        placeholder="Chia sẻ cảm xúc của bạn!">

                </div>
            </div>


            <div class="card ">
                <div class="d-flex flex-row">
                    <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                        class="img-normal rounded-circle">
                    <div class="d-flex flex-column">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text"><small class="text-body-secondary">3 mins ago</small></p>
                    </div>
                </div>
                <div class="card-body">

                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                        additional content. This content is a little bit longer.</p>

                </div>
            </div>



            <div class="card ">
                <div class="d-flex flex-row">
                    <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                        class="img-normal rounded-circle">
                    <div class="d-flex flex-column">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text"><small class="text-body-secondary">3 mins ago</small></p>
                    </div>
                </div>
                <div class="card-body">

                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                        additional content. This content is a little bit longer.</p>

                </div>

            </div>

            <div class="card">
                <div class="d-flex flex-row">
                    <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                        class=" img-normal  rounded-circle">
                    <div class="d-flex flex-column">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text"><small class="text-body-secondary">3 mins ago</small></p>
                    </div>
                </div>

                <div class="card-body">

                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                        additional content. This content is a little bit longer.</p>

                </div>
                <img src="..." class="card-img-bottom" alt="...">
                <div class="card-footer">
                    <div class="d-flex flex-row">
                        <a class="a-footer-card" href="#"><i class="bi bi-heart-fill" style="color: red;"></i>18</a>
                        <a class="a-footer-card" href="#">26 Bình luận</a>
                        <a class="a-footer-card" href="#">5 Chia sẻ</a>
                    </div>
                    <div class="btn-group">
                        <button type="button" id="btn-heart" class="btn btn-footer-card btn-outline-secondary"
                            onclick="clickHeart()" fdprocessedid="9g79xr">
                            <i class="bi bi-heart" id="i-lightheart"> Yêu thích</i>
                            <span class="visually-hidden">Button</span>
                        </button>
                        <button type="button" id="btn-create-comment" class="btn btn-footer-card btn-outline-secondary"
                            fdprocessedid="ggkv13">
                            <i class="bi bi-chat"> Bình luận</i>
                            <span class="visually-hidden">Button</span>
                            <div class="list-comments">

                            </div>
                        </button>

                        <button type="button" class="btn btn-footer-card btn-outline-secondary" fdprocessedid="f8z0xn">
                            <i class="bi bi-share"> Chia sẻ</i>
                            <span class="visually-hidden">Button</span>
                        </button>
                    </div>
                    <div class="list-comments">
                        <div class="user-comment comment">
                            <div class="d-flex flex-row">
                                <img src="https://github.com/mdo.png" alt="mdo" width="32" height="32"
                                    class="rounded-circle">
                                <div class="detail-comment">
                                    <h6>Nguyễn Nam</h6>
                                    <p class="card-text"><small class="text-body-secondary">3 mins ago</small>
                                    </p>
                                    <p>Ảnh rất đẹp !</p>
                                </div>

                            </div>
                            <div class="title-actioncomment d-flex flex-row">
                                <a href="#">
                                    <p>3 phút</p>
                                </a>
                                <a href="#">
                                    <p>Yêu thích</p>
                                </a>
                                <a href="#">
                                    <p>Phản hồi</p>
                                </a>
                            </div>
                        </div>
                        <div class="my-comment d-flex flex-row comment">
                            <img src="https://github.com/mdo.png" alt="mdo" width="32" height="32"
                                class="rounded-circle">
                            <input type="text" class="form-control" onchange="inputComment()" onkeydown="inputComment()"
                                placeholder="Viết bình luận..." id="my-inputcomment" aria-describedby="basic-addon1">
                            <a href="#">
                                <i id="i-send" class="bi  bi-send"></i>
                            </a>
                        </div>

                    </div>

                </div>

            </div>
            </div>
            <div  class=" list-messages flex-column flex-md-row p-4 gap-4 py-md-5 align-items-center justify-content-center">
                <div id="div-listmessages" class="list-group  group-messages" >
                    <div class="div-tilte-button d-flex flex-row">
                    <h2>Đoạn chat</h2>
                    <button type="button" class="btn btn-listchats btn-light btn-friend " onclick="showCreateNewMessage()"><i class="bi bi-pencil-square"></i></button>
                    <button type="button" class="btn btn-listchats btn-light btn-friend " onclick="closeLissMessages()" ><i class="bi bi-x-lg"></i></i></button>
                    </div>
                    <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                        <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                            class=" img-normal  rounded-circle">
                        <div class="d-flex gap-2 w-100 justify-content-between">
                            <div>
                                <h6 class="mb-0">List group item heading</h6>
                                <p class="mb-0 opacity-75">Some placeholder content in a paragraph.</p>
                            </div>
                            <small class="opacity-50 text-nowrap">now</small>
                        </div>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                        <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                            class=" img-normal  rounded-circle">
                        <div class="d-flex gap-2 w-100 justify-content-between">
                            <div>
                                <h6 class="mb-0">Another title here</h6>
                                <p class="mb-0 opacity-75">Some placeholder content in a paragraph that goes a little
                                    longer so it wraps to a new line.</p>
                            </div>
                            <small class="opacity-50 text-nowrap">3d</small>
                        </div>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                        <img src="https://github.com/mdo.png" alt="mdo" width="40" height="40"
                            class=" img-normal  rounded-circle">
                        <div class="d-flex gap-2 w-100 justify-content-between">
                            <div>
                                <h6 class="mb-0">Third heading</h6>
                                <p class="mb-0 opacity-75">Some placeholder content in a paragraph.</p>
                            </div>
                            <small class="opacity-50 text-nowrap">1w</small>
                        </div>
                    </a>
                </div>
            </div>
            <div class="div-createmessage" id="div-createNewMessage">
                <div  class="list-group  group-messages" >
                    <div class="div-tilte-button d-flex flex-row">
                    <h5>Tin nhắn mới</h5>
                    <button type="button" id="btn-closenewmessage" class="btn btn-listchats btn-light " onclick="closeCreateNewMessage()" ><i class="bi bi-x-lg"></i></i></button>
                    </div>
                    <div class="input-group ">
                        <span class="input-group-text" id="basic-addon1">Đến</span>
                        <input type="text" class="form-control"  aria-describedby="basic-addon1">
                    </div>
                    <a href="#" id="a-input-mess" style="width: 100%;" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                        <img src="https://github.com/mdo.png" style="text-align: center;" alt="mdo" width="40" height="40"
                            class=" img-normal  rounded-circle">
                            <h6 class="mb-0">Văn Quang</h6>
                    </a>   
                        <div  class="d-flex input-contentmess">
                            <input type="text" class="form-control" onchange="inputMessage()" onkeydown="inputMessage()"
                                placeholder="Nội dung tin nhắn ..." id="my-inputmessage" >
                            <a href="#">
                                <i id="i-send-mess" class="bi  bi-send"></i>
                            </a>
                        </div>
                    
                   
                    
                </div>
            </div>

            <script src="../js/myjs/homepage.js"></script>
</body>

</html>