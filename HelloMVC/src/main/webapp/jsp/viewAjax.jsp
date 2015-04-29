<h1>
	<fmt:message key="person.form.title" />
</h1>

<c:if test="${not empty statusMessageKey}">
	<p style="color: red;">${statusMessageKey}</p>
</c:if>

<style type="text/css">
.formFieldError{
	color:red;
}
</style>

<div id="msg"></div>

<c:url var="url" value="/view" />
<form:form action="${url}" modelAttribute="personDTO" id="personForm">
	<form:hidden path="id" />

	<fieldset>
		<div class="form-row">
			<label for="firstName"><fmt:message	key="person.form.firstName" />:</label> 
			<span class="input"><form:input path="firstName" /></span> 
			<span><form:errors path="firstName"	style="color:red;" /></span>
		</div>
		<div class="form-row">
			<label for="lastName"><fmt:message key="person.form.lastName" />:</label>
			<span class="input"><form:input path="lastName" /></span> 
			<span><form:errors path="lastName" style="color:red;" /></span>
		</div>
		<div class="form-row">
			<label for="email"><fmt:message key="person.form.email" />:</label>
			<span class="input"><form:input path="email" /></span> 
			<span><form:errors path="email" style="color:red;" /></span>
		</div>
		<div class="form-buttons">
			<div class="button"><input name="submit" type="submit" value="<fmt:message key="button.save"/>" />
			</div>
		</div>
	</fieldset>
</form:form>

