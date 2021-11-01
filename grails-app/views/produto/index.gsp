<%--
  Created by IntelliJ IDEA.
  User: ravtec
  Date: 29/10/2021
  Time: 09:43
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8" name="layout" content="main">
    <title>Gerenciamento de Produtos</title>
    <g:javascript library="jquery"/>

    <script type="text/javascript">
        function carregarLista(){
            <g:remoteFunction controller="produto" action="lista" update="divLista" />
        }
        function excluir(id){
            if(confirm("Deseja realmente excluir?")){
                <g:remoteFunction controller="produto" action="excluir" update="divLista" id="'+id+'"  />
            }
        }
    </script>

</head>

<body>
    <g:remoteLink controller="produto" action="adicionar" update="divForm">Adicionar</g:remoteLink>

    <div id="divLista">
        <g:render template="lista" model="[produtos:produtos]"></g:render>
    </div>

    <div id="divForm"></div>
</body>
</html>