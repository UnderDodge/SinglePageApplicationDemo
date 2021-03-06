<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en" dir="ltr">
<head>
    <title>GamesForRent</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles/layout.css">
    <!--[if lt IE 9]><script src="scripts/html5shiv.js"></script><![endif]-->
</head>
<body>
<div class="wrapper row1">
    <header id="header" class="clear">
        <div id="hgroup">
            <h1><a href="#">GamesForRent</a></h1>
            <h2></h2>
        </div>
        <nav>
            <ul>
                <li><a href="home">Home</a></li>
                <li><a href="login">Sign In</a></li>
                <li><a href="registration">Sign Up</a></li>
                <li><a href="#">Text Link</a></li>
                <li class="last"><a href="#">Text Link</a></li>
            </ul>
        </nav>
    </header>
</div>
<!-- content -->
<div class="wrapper row2">
    <div id="container" class="clear">
        <!-- content body -->
        <div id="homepage">
            <!-- One Quarter -->
            <section id="latest" class="clear">
                <c:set var="counter" value="0" scope="page" />
                <c:forEach items="${game1}" var="pr">
                    <c:choose>
                    <c:when test="${counter<3}">
                    <article class="one_quarter">
                        <figure><img src="images/${pr.getId()}.jpg" width="210" height="310" alt="">
                            <figcaption>${pr.getName()}</figcaption>
                        </figure>
                    </article>
                        <c:set var="counter" value="${counter + 1}" scope="page" />
                    </c:when>
                    <c:otherwise>
                        <c:set var="counter" value="${counter=0}" scope="page" />
                        <article class="one_quarter lastbox">
                            <figure><img src="images/${pr.getId()}.jpg" width="210" height="310" alt="">
                                <figcaption>${pr.getName()}</figcaption>
                            </figure>
                        </article>
                    </c:otherwise>
                    </c:choose>
                </c:forEach>
            </section>
            <!-- / One Quarter -->
            <section id="shout">
                <p>Welcome to GamesForRent. Above is our current games list. You can rent any game that is in stock.</p>
            </section>
        </div>
        <!-- main content -->
        <div id="content">
            <section id="services" class="last clear">
                <ul>
                    <li>
                        <article class="clear">
                            <figure><img src="images/demo/180x150.gif" alt="">
                                <figcaption>
                                    <h2>Indonectetus facilis leo nibh</h2>
                                    <p>This is a W3C compliant free website template from <a href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a>. For full terms of use of this template please read our <a href="https://www.os-templates.com/template-terms">website template licence</a>.</p>
                                    <footer class="more"><a href="#">Read More &raquo;</a></footer>
                                </figcaption>
                            </figure>
                        </article>
                    </li>
                    <li class="last">
                        <article class="clear">
                            <figure><img src="images/demo/180x150.gif" alt="">
                                <figcaption>
                                    <h2>Indonectetus facilis leo nibh</h2>
                                    <p>You can use and modify the template for both personal and commercial use. You must keep all copyright information and credit links in the template and associated files. For more HTML5 templates visit <a href="https://www.os-templates.com/">free website templates</a>.</p>
                                    <footer class="more"><a href="#">Read More &raquo;</a></footer>
                                </figcaption>
                            </figure>
                        </article>
                    </li>
                </ul>
            </section>
        </div>
        <!-- right column -->
        <aside id="right_column">
            <h2 class="title">Categories</h2>
            <nav>
                <ul>
                    <li><a href="#">Free Website Templates</a></li>
                    <li><a href="#">Free CSS Templates</a></li>
                    <li><a href="#">Free XHTML Templates</a></li>
                    <li><a href="#">Free Web Templates</a></li>
                    <li><a href="#">Free Website Layouts</a></li>
                    <li><a href="#">Free HTML 5 Templates</a></li>
                    <li><a href="#">Free Webdesign Templates</a></li>
                    <li><a href="#">Free FireWorks Templates</a></li>
                    <li><a href="#">Free PNG Templates</a></li>
                    <li class="last"><a href="#">Free Website Themes</a></li>
                </ul>
            </nav>
            <!-- /nav -->
        </aside>
        <!-- / content body -->
    </div>
</div>
<!-- Footer -->
<div class="wrapper row3">
    <footer id="footer" class="clear">
        <p class="fl_left"><a href="https://github.com/UnderDodge/">Developed by - UnderDodge</a></p>
        <p class="fl_right">Template by <a target="_blank" href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    </footer>
</div>
</body>
</html>
