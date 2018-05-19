<#-- 取得 应用的绝对根路径 -->
<#import "spring.ftl" as spring />
<#macro base base_title base_keywords="" base_js=[] base_css=[]>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>${base_title}</title>
    <link rel="stylesheet" href="<@spring.url '/layui/css/layui.css'/>">
    <script src="<@spring.url '/layui/layui.js'/>"></script>
</head>
<body>
<!--导航栏-->
<div>
    <ul class="layui-nav layui-bg-green ">
        <li class="layui-nav-item"><a href="">性格测试</a></li>
        <li class="layui-nav-item layui-this layui-col-md-offset5"><a href="">大学</a></li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">社区</a></li>
    </ul>
</div>
<div>
     <#nested>
</div>
<div>
    <footer class="layui-">
        <p>pwd</p>
    </footer>
</div>
</body>
</html>
</#macro>
