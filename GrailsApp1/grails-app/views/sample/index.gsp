<html>
	<body>
		<h1>Index inside SampleController</h1>
		<g:form action="login" controller="sample">
			User name <g:textField name="username"/><br/>
			Password <g:passwordField name="password"/><br/>
			<g:submitButton name="submit" value="Login"/>
			<h1>
				${flash.msg}
			</h1>
		</g:form>		
	</body>
</html>
