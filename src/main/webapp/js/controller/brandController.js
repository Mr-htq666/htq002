app.controller('brandController',function ($scope,$controller,brandService) {
    $controller('baseController',{$scope:$scope});
    //删除
    $scope.deleteBrand=function(){
        brandService.deleteBrand($scope.selectIds).success(function (response) {
            if(response.success){
                //添加成功 刷新页面
                $scope.reloadList();
            }else {
                alert(response.message);
            }
        });
    };
    $scope.getTeam=function(){
        brandService.getTeam().success(function (response) {
            $scope.tlist=response;
        })
    }
    $scope.getSchool=function(){
        brandService.getSchool().success(function (response) {
            $scope.slist=response;
        })
    }
    $scope.getSss=function(){
        brandService.getSss($scope.entity).success(function (response) {

               alert(response.message);

        })
    }
    //修改回显
    $scope.findOne =function(id){
        brandService.findOne(id).success(function (response) {
            $scope.entity=response;
        })
    };
    //添加
    $scope.save =function () {
      $scope.entity.sid= $("#s").val();
        $scope.entity.tid= $("#t").val();
        brandService.save($scope.entity).success(function (response) {
            if(response.success){
                //添加成功 刷新页面
                $scope.reloadList();
            }else {
                alert(response.message);
            }
        })
    };
    //查询全部
    $scope.getPlayer = function () {
        brandService.getPlayer().success(function (response) {
            $scope.list = response;
        })
    };




});