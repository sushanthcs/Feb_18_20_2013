<html>
<body>
	<g:form action="play">
		Enter your guess <g:textField name="guess" />
		<p>${flash.error}</p>
		<g:submitButton name="submit" value="Guess"/>
		<h3>
			${flash.message}
		</h3>
		<h3>
			${flash.attempts}
		</h3>
		<g:if test="${flash.gameOver}">
			<g:link controller="history">View history</g:link>
		</g:if>
	</g:form>
</body>
</html>