app.service('brandService',function ($http) {
    this.deleteBrand=function (selectIds) {
        return $http.post("../pc/deletePlayer.do",selectIds);
    }

    this.save=function (entity) {
        alert(entity);
        return $http.post("../pc/save.do",entity);
    }
    this.getPlayer=function () {
        return $http.get('../pc/getPlayer.do');
    }
    this.getSchool=function () {
        return $http.get("../pc/getSchool.do");
    }
    this.getTeam=function () {
        return $http.get("../pc/getTeam.do");
    }
    this.getSss=function (entity) {
        return $http.post("../pc/getSss.do",entity);
    }
});