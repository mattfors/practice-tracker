angular.module('practrac')
	.controller("DemoController", function($scope,$http) {	  
		 $http.get('/practice-tracker/rest/song').success(function(songResponse) {
		  $scope.songs = songResponse;
		});
});