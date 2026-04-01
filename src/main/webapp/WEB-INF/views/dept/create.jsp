<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Department</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column min-vh-100 bg-light">

	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="py-5">
			<div class="container px-5">

				<!-- 제목 -->
				<div class="text-center mb-5">
					<h1 class="display-5 fw-bolder mb-3">
						<span class="text-gradient d-inline">Create Department</span>
					</h1>
					<p class="text-muted mb-0">부서 정보를 입력해 새 부서를 등록합니다.</p>
				</div>

				<!-- 카드 영역 -->
				<div class="row justify-content-center">
					<div class="col-lg-8 col-xl-7">
						<div class="card border-0 shadow rounded-4">
							<div class="card-body p-4 p-md-5">

								<form action="./create" method="post">

									<!-- Department Name -->
									<div class="mb-4">
										<label for="departmentName" class="form-label fw-semibold">
											Department Name </label> <input type="text"
											class="form-control form-control-lg" id="departmentName"
											name="departmentName" placeholder="부서명 입력">
									</div>

									<!-- Manager Id -->
									<div class="mb-4">
										<label for="managerId" class="form-label fw-semibold">
											Manager Id </label> <input type="text"
											class="form-control form-control-lg" id="managerId"
											name="managerId" placeholder="관리자 번호 입력">
									</div>

									<!-- Location Id -->
									<div class="mb-4">
										<label for="locationId" class="form-label fw-semibold">
											Location Id </label> <input type="text"
											class="form-control form-control-lg" id="locationId"
											name="locationId" placeholder="지역 번호 입력">
									</div>

									<!-- 버튼 -->
									<div class="d-grid mt-4">
										<button type="submit" class="btn btn-primary btn-lg rounded-3">
											Submit</button>
									</div>
								</form>

							</div>
						</div>
					</div>
				</div>

			</div>
		</section>
	</main>

	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>