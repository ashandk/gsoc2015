var app = angular.module('myApp', []);

app.controller('myCtrl', function ($scope) {
    $scope.showOverallStat = true;
    $scope.showClusterIns = false;
    $scope.heading = "Overall Statistics";

    $scope.onClickOverallStat = function () {
        $scope.showOverallStat = true;
        $scope.showClusterIns = false;
        $scope.heading = "Overall Statistics";

        $("#li1").addClass("active");
        $("#li2").removeClass("active");
        $("#li3").removeClass("active");

    }

    $scope.onClickclusterIns = function () {
        $scope.showOverallStat = false;
        $scope.showClusterIns = true;
        $scope.heading = "Cluster Instance";

        $("#li2").addClass("active");
        $("#li1").removeClass("active");
        $("#li3").removeClass("active");
    }

    $scope.onClickMemberInstance = function () {
        $scope.showOverallStat = true;
        $scope.showClusterIns = false;
        $scope.heading = "Member Instance";

        $("#li3").addClass("active");
        $("#li1").removeClass("active");
        $("#li2").removeClass("active");
    }
});

// bar charts
var barChart = c3.generate({
    bindto: '#barChart',
    data: {
        type: 'bar',
        json: [
            { 'indicator': 'Memory Consumption', 'Count': 100 },
            { 'indicator': 'AVG Memory Consumption', 'Count': 200 },
            { 'indicator': 'Load Average', 'Count': 300 }
        ],
        keys: {
            x: 'indicator',
            value: ['Count']
        }
    },
    axis: {
        x: {
            label: 'Name',
            position: 'outer-center',
            type: 'category',            
        }
    },
    bar: {
        width: {
            ratio: 0.5
        }
    },
    grid: {
	  y: {
	    lines: [{value: 150, text: 'label at value 150'}]
	  }
	}
});

// spline charts
var splineChart = c3.generate({
    bindto: '#splineChart',
    data: {
        columns: [
            ['No Requests Cluster One', 30, 200, 100, 400, 150, 250],
            ['No Requests Cluster Two', 130, 100, 140, 200, 150, 50],
            ['No Requests Cluster Three', 10, 120, 90, 40, 250, 150]
        ],
        type: 'spline'
    },
    axis: {
        x: {
            position: 'outer-center',
            label: 'X Axis'
        }
    }
});

// pie charts
var pieChart = c3.generate({
    bindto: '#pieChart',
    data: {
        // iris data from R
        columns: [
            ['data1', 30],
            ['data2', 120],
            ['data3', 60],
        ],
        type: 'pie',
        onclick: function (d, i) { console.log("onclick", d, i); },
        onmouseover: function (d, i) { console.log("onmouseover", d, i); },
        onmouseout: function (d, i) { console.log("onmouseout", d, i); }
    }
});

// line charts
var lineChart = c3.generate({
    bindto: '#lineChart',
    data: {
        columns: [
            ['data1', 30, 200, 100, 400, 150, 250],
            ['data2', 50, 20, 10, 40, 15, 25]
        ],
        regions: {
            'data1': [{ 'start': 1, 'end': 2, 'style': 'dashed' }, { 'start': 3 }], // currently 'dashed' style only
            'data2': [{ 'end': 3 }]
        }
    }
});

// onclick of hide button
$('#hide').click(function () {
    lineChart.hide(['data1']);
});

// onclick of show button
$('#show').click(function () {
    lineChart.show(['data1']);
});

