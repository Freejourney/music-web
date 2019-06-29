<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>查询数据</h1>
<form method="post" action="selectByUserId.action">
    您要查找的用户id：<input type="text" name="uid">
    <input type="submit" value="提交">
</form>
<div id="1to1Result">
    用户姓名：${simpleResult.username1}<br>
    用户工作空间：${simpleResult.workplace}<br>
    事件名字：${simpleResult.meetingname}<br>
    事件内容：${simpleResult.meetingcontent}<br>
    发表人id：${simpleResult.publisherid}
</div>


<form method="post" action="selectBySpecialistId.action">
    您要查找的专家的id：<input type="text" name="sid">
    <input type="submit" value="提交">
</form>
<div id="onetooneselect">
    专家姓名：${Result.username}<br>
    专家真实姓名：${Result.realname}<br>
    专家密码：${Result.password}<br>
    专家地址：${Result.address}<br>
    专家电话号码：${Result.phonenumber}<br>
    事件名字：${Result.meetingname}<br>
    事件内容：${Result.meetingcontent}<br>
    发表人id：${Result.publisherid}
</div>

</body>
</html>
