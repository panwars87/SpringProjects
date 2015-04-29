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

<div id="page2-msg"></div>

<c:url var="url" value="/page2" />
<form:form action="${url}" modelAttribute="personDTO" id="addressForm">
	<form:hidden path="id" />

	<fieldset>
		<div class="form-row">
			<label for="address.lane1"><fmt:message	key="address.form.lane1" />:</label> 
			<span class="input"><form:input path="address.lane1" /></span> 
			<span><form:errors path="address.lane1"	style="color:red;" /></span>
		</div>
		<div class="form-row">
			<label for="address.lane2"><fmt:message key="address.form.lane2" />:</label>
			<span class="input"><form:input path="address.lane2" /></span> 
			<span><form:errors path="address.lane2" style="color:red;" /></span>
		</div>
		<div class="form-row">
			<label for="address.zipcode"><fmt:message key="address.form.zipcode" />:</label>
			<span class="input"><form:input path="address.zipcode" /></span> 
			<span><form:errors path="address.zipcode" style="color:red;" /></span>
		</div>
		<div class="form-buttons">
			<div class="button"><input name="submit" type="submit" value="<fmt:message key="button.save"/>" />
			</div>
			<a href="javascript:backFunction('page1');" ><input type="button" value="Back" /></a>
		</div>
	</fieldset>
</form:form>

