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
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th>
                            类目id
                        </th>
                        <th>
                            名称
                        </th>
                        <th>
                            type
                        </th>
                        <th>
                            创建时间
                        </th>
                        <th>
                            修改时间
                        </th>
                        <th colspan="2">
                            操作
                        </th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list categoryList as category>
                    <tr class="success">
                        <td>
                        ${category.categoryId}
                        </td>
                        <td>
                        ${category.categoryName}
                        </td>
                        <td>
                        ${category.categoryType}
                        </td>
                        <td>
                        ${category.createTime}
                        </td>
                        <td>
                        ${category.updateTime}
                        </td>
                        <td><a href="/sell/seller/category/index?categoryId=${category.categoryId}">修改</a></td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>


        </div>
    </div>

</body>
</html>

