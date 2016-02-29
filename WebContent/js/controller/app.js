var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.get("TestServlet")
    .then(function(response) {
    	$scope.employees =[
    	                  {name: "France", Address: 63.1},
    	                  {name: "United Kingdom", Address: 61.8}
    	              ];
    });
});
