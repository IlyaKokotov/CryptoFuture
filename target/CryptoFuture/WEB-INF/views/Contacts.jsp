
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
    <link href="${contextPath}/resources/css/Contacts.css" rel="stylesheet">


</head>

<body>

<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
            <li><a href="login.html">Home</a></li>
            <li><a href="about.html">About</a></li>
            <li class="active"><a href="contacts.html">Contact</a></li>
        </ul>
        <h3 class="text-muted">CryptoAnalytics</h3>
    </div>

    <div class="jumbotron">
        <h1>We are from Yekaterinburg</h1>
        <p class="lead">The capital of the Urals is also in the crypto industry</p>
        <p><a class="btn btn-lg btn-success" href="registration.html" role="button">Registration</a></p>
    </div>

    <div class="row marketing">
        <div class="col-lg-6">
            <h4>24 Lenina str.</h4>
            <p>4th floor, 8 932-604-21-43</p>

            <h4>Consider avoiding an ICO if:</h4>
            <p> The people behind the project are anonymous, use fake identities or have fake accounts on social networks.
                - The team lacks professionals with relevant experience.
                - There is no legal entity.
                - The whitepaper and business plan sound unrealistic and or lack detailed analysis of the market and competitors.
                - The projects authors do not provide an example of their blockchain code.
                - There is no working prototype. </p>


        </div>

        <div class="col-lg-6">
            <h4>Why Russia?</h4>
            <p>Coinbase is the worlds biggest bitcoin broker. It exchanges bitcoin, ether,
                litecoin and bitcoin cash for 32 fiat currencies, and can be used in 190
                countries. Its quick and easy to use, secure, and comes with relatively
                low exchange fees (although Kraken
                Founded in 2011 and focused on experienced traders, US-based Kraken is the largest crypto
                exchange when it comes to trading in euros. Its also one of the most secure, given the comprehensive
                range of safety measures the exchange takes, such </p>




        </div>
    </div>

    <div class="footer">
        <p>2018. All rights reserved, analytics by <a href="https://www.binance.com">Binance</a>.</p>
    </div>

</div> <!-- /container -->
</body>
</html>