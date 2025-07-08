<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#editDiv{border: 1px solid black; margin: auto; margin-top: 150px; padding: 130px; width: 500px;}
	#editDiv>label:hover{font-weight: bold; text-decoration: underline; cursor: pointer;}
	#editDiv td{text-align: right;}
	.editInput{height: 30px; width: 200px;}
	.editInput.select{width: 208px;}
	#editButton{border: 1px solid black; width: 300px; padding: 15px; border-radius: 15px; background: white;}
	#editButton:hover{background: black; color: white; cursor: pointer;}
</style>
</head>
<body>
	<jsp:include page="../common/top.jsp"/>
	<jsp:include page="../common/loginbar.jsp"/>
	<form action="${ contextPath }/updateEmp.me" method="post" id="editForm" name="editFrm">
		<div align="center" id="editDiv">
			<table>
				<tr>
					<td><label for="id">사원번호</label></td>
					<td><input type="text" name="id" id="id" class="editInput" size="25" readonly style="background: lightgray;"  value="${ loginUser.empNo }"></td>
				</tr>
				<tr>
					<td><label for="pwd">비밀번호</label></td>
					<td><input type="password" name="pwd" id="pwd" class="editInput" size="25"></td>
				</tr>
				<tr>
					<td><label for="pwdConfirm">비밀번호 확인</label></td>
					<td><input type="password" id="pwdConfirm" class="editInput" size="25"></td>
				</tr>
				<tr>
					<td><label for="name">이름</label></td>
					<td><input type="text" name="name" id="name" class="editInput" size="25" required value="${ loginUser.empName }"></td>
				</tr>
				<tr>
					<td><label for="job">직업</label></td>
					<td><input type="text" name="job" id="job" class="editInput" size="25" required value="${ loginUser.job }"></td>
				</tr>
				<tr>
					<td><label for="sal">급여</label></td>
					<td><input type="number" name="sal" class="editInput" id="sal" size="25" required value="${ loginUser.sal }"></td>
				</tr>
				<tr>
					<td><label for="comm">커미션</label></td>
					<td><input type="number" name="comm" class="editInput" id="comm" size="25" value="${ loginUser.comm }"></td>
				</tr>
				<tr>
					<td><label for="dept">부서</label></td>
					<td>
						<select name="dept" class="editInput select">
							<option>---------------------------------------</option>
							<option value="10" ${ loginUser.deptNo == 10 ? 'selected' : '' }>ACCOUNTING</option>
							<option value="20" ${ loginUser.deptNo == 20 ? 'selected' : '' }>RESEARCH</option>
							<option value="30" ${ loginUser.deptNo == 30 ? 'selected' : '' }>SALES</option>
							<option value="40" ${ loginUser.deptNo == 40 ? 'selected' : '' }>OPERATIONS</option>
						</select>
					</td>
				</tr>
			</table>
			<br>
			<button id="editButton">수정</button>
		</div>
	</form>
	<script>
		window.onload = () =>{
			document.getElementById('editButton').onclick = e =>{
					const dept = document.getElementsByName('dept')[0];
					if(dept.value.indexOf('-') == 0){
						alert('부서는 필수 선택 항목입니다');
						dept.focus();
						e.preventDefault();
					}
			}
		}
	</script>
</body>
</html>