
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CryptoFuture</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/cover.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>


<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">CryptoAnalytics</h3>
                    <ul class="nav masthead-nav">
                        <li class="active"><a href="login.html">Home</a></li>
                        <li><a href="about.html">About us</a></li>
                        <li><a href="Contacts.html">Contact</a></li>
                    </ul>
                </div>
            </div>

            <div class="inner cover">
                    <form method="POST" action="${contextPath}/login" class="form-signin">
                        <h2 class="form-heading">Log in</h2>

                        <div class="form-group ${error != null ? 'has-error' : ''}">
                            <span>${message}</span>
                            <input name="username" type="text" class="form-control" placeholder="Username"
                                   autofocus="true"/>
                            <input name="password" type="password" class="form-control" placeholder="Password"/>
                            <span>${error}</span>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
                        </div>
                    </form>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>2018. All rights reserved, analytics by <a href="https://www.binance.com">Binance</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>


<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>