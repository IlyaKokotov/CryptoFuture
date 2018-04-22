
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
    <link href="${contextPath}/resources/css/about.css" rel="stylesheet">


</head>

<body>

<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
            <li><a href="login.html">Home</a></li>
            <li class="active"><a href="about.html">About</a></li>
            <li><a href="Contacts.html">Contact</a></li>
        </ul>
        <h3 class="text-muted">CryptoAnalytics</h3>
    </div>

    <div class="jumbotron">
        <h1>Cryptocurrency today</h1>
        <p class="lead">This is a type of digital or virtual currency that doesnt need to exist in a physical form to have value.</p>
        <p><a class="btn btn-lg btn-success" href="registration.html" role="button">Registration</a></p>
    </div>

    <div class="row marketing">
        <div class="col-lg-6">
            <h4>Can I create my own cryptocurrency?</h4>
            <p>Several existing blockchain platforms let you to make your own currency – as a community coin, a joke, or for any other reason. They make creating a cryptocurrency as easy as filling out a webform: just specify a name, number of coins and a few other details, and there it is..</p>

            <h4>What is an ICO?</h4>
            <p>The market saw 235 ICOs in 2017, five times more than in 2016. They helped raise over USD 3.7 billion, compared with USD 96 million in 2016. The largest ICO to date (as of December 2017) is that of Filecoin, a decentralized data storage network, which raised USD 257 million in 2017. Lists of ongoing ICOs can be found at coinschedule.com and on other websites.</p>


        </div>

        <div class="col-lg-6">
            <h4>Why invest in an ICO?</h4>
            <p>Backing a crowdfunded project, by comparison, basically means donating money. And in an Initial Public Offering (IPO) – the traditional way of raising capital on a stock exchange – an investor gets shares in a company, which come with voting rights and the right to dividends.</p>

            <h4>What are the risks in an ICO?</h4>
            <p>The market is still under-regulated. That means investors may be left on their own if an ICO turns out to be a fraud or the project fails. Neither of these scenarios is uncommon.

                But market watchdogs now have ICOs on their radar. In July 2017, the U.S. Securities and Exchange Commission said it may apply federal securities laws to some ICOs on a case-by-case basis. In September of the same year, China temporarily banned ICOs until market regulations are in place. The EU plans to issue regulatory guidelines for ICOs in 2018.</p>


        </div>
    </div>

    <div class="footer">
        <p>2018. All rights reserved, analytics by <a href="https://www.binance.com">Binance</a>.</p>
    </div>

</div> <!-- /container -->
</body>
</html>