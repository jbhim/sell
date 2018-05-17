<html>
    <head>
        <meta charset="UTF-8">
        <title>卖家后台管理</title>
        <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    </head>
<body>
    <#include "../common/hand.ftl">
    <br>
    <hr>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <form role="form" method="post" action="/sell/seller/category/save">
                    <div class="form-group">
                        <label>名称</label>
                        <input name="categoryName" type="text" class="form-control" value="${(category.categoryName)!''}"/>
                    </div>



                    <div class="form-group">
                        <label>type</label>
                        <input name="categoryType" type="number" class="form-control" value="${(category.categoryType)!''}"/>
                    </div>


                    <input hidden name="categoryId" value="${(category.categoryId)!''}">

                    </div> <button type="submit" class="btn btn-default">提交</button>
                </form>
            </div>
        </div>
    </div>

</body>
</html>

