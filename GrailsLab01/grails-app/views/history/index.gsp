<html>
	<body>
		<table border="1">
			<thead>
				<tr>
					<th>Attempts</th>
					<th>Guess</th>
				</tr>
				<g:each in="${flash.history}" var="item">
					<tr>
						<td>${item.key}</td>
						<td>${item.value}</td>
					</tr>
				</g:each>
			</thead>
		</table>
	</body>
</html>