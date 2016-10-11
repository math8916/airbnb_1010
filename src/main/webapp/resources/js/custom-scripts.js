/*------------------------------------------------------
    Author : www.webthemez.com
    License: Commons Attribution 3.0
    http://creativecommons.org/licenses/by/3.0/
---------------------------------------------------------  */

(function ($) {
    "use strict";
    var mainApp = {

        initFunction: function () {
            /*MENU 
            ------------------------------------*/
            $('#main-menu').metisMenu();
			
            $(window).bind("load resize", function () {
                if ($(this).width() < 768) {
                    $('div.sidebar-collapse').addClass('collapse')
                } else {
                    $('div.sidebar-collapse').removeClass('collapse')
                }
            });

            /* MORRIS BAR CHART
			-----------------------------------------*/
            Morris.Bar({
                element: 'morris-bar-chart',
                data: [{
                    y: '1월',
                    a: 10000
                }, {
                    y: '2월',
                    a: 7500
                }, {
                    y: '3월',
                    a: 5000
                    
                }, {
                    y: '4월',
                    a: 7500
                }, {
                    y: '5월',
                    a: 5000
                }, {
                    y: '7월',
                    a: 7500,
                }, {
                    y: '8월',
                    a: 8800
                },{
                    y: '9월',
                    a: 9800
                },{
                    y: '10월',
                    a: 8000
                },{
                    y: '11월',
                    a: 2500
                },{
                    y: '12월',
                    a: 1000
                }],
                xkey: 'y',
                ykeys: ['a'],
                labels: ['Series A'],
                hideHover: 'auto',
                resize: true
            });

            /* MORRIS DONUT CHART
			----------------------------------------*/
            Morris.Donut({
                element: 'morris-donut-chart',
                data: [{
                    label: "전체 순수 회원수",
                    value: 52545
                }, {
                    label: "전체 호스팅 회원수",
                    value: 30340
                }],
                resize: true
            });

            /* MORRIS AREA CHART
			----------------------------------------*/

            Morris.Area({
                element: 'morris-area-chart',
                data: [{
                    period: '2016-01',
                    회원수: 12666,
                    호스팅수: 9000,
                    예약수: 2647
                }, {
                   period: '2016-02',
                    회원수: 22666,
                    호스팅수: 19000,
                    예약수: 12647
                }, {
                   period: '2016-03',
                    회원수: 19666,
                    호스팅수: 9800,
                    예약수: 8647
                }, {
                   period: '2016-04',
                    회원수: 32666,
                    호스팅수: 26000,
                    예약수: 12647
                }, {
                   period: '2016-05',
                    회원수: 22366,
                    호스팅수: 26000,
                    예약수: 9647
                }, {
                   period: '2016-06',
                    회원수: 52366,
                    호스팅수: 36000,
                    예약수: 19647
                }, {
                   period: '2016-07',
                    회원수: 35666,
                    호스팅수: 26000,
                    예약수: 15647
                }, {
                   period: '2016-08',
                    회원수: 33666,
                    호스팅수: 21000,
                    예약수: 57540
                }, {
                   period: '2016-09',
                    회원수: 55666,
                    호스팅수: 46000,
                    예약수: 45647
                }, {
                   period: '2016-10',
                    회원수: 35666,
                    호스팅수: 26000,
                    예약수: 15647
                }, {
                   period: '2016-11',
                    회원수: 15666,
                    호스팅수: 16000,
                    예약수: 10647
                }, {
                   period: '2016-12',
                    회원수: 12666,
                    호스팅수: 6000,
                    예약수: 25647
                }],
                xkey: 'period',
                ykeys: ['회원수', '호스팅수', '예약수'],
                labels: ['회원수', '호스팅수', '예약자수'],
                pointSize: 2,
                hideHover: 'auto',
                resize: true

            });

            /* MORRIS LINE CHART
			----------------------------------------*/
            Morris.Line({
                element: 'morris-line-chart',
                data: [{
                    y: '2009',
                    a: 100000,
                    b: 90000
                }, {
                    y: '2010',
                    a: 75000,
                    b: 65000
                }, {
                    y: '2011',
                    a: 50000,
                    b: 40000
                }, {
                    y: '2012',
                    a: 75000,
                    b: 65000
                }, {
                    y: '2014',
                    a: 50000,
                    b: 40000
                }, {
                    y: '2015',
                    a: 75000,
                    b: 65000
                }, {
                    y: '2016',
                    a: 120000,
                    b: 90000
                }],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['회원가입자 수', '호스팅 수'],
                hideHover: 'auto',
                resize: true
            });
           
     
        },

        initialization: function () {
            mainApp.initFunction();

        }

    }
    // Initializing ///

    $(document).ready(function () {
        mainApp.initFunction();
    });

}(jQuery));
