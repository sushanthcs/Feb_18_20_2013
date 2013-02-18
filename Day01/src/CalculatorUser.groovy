calc = new Calculator(num1:10,num2:8)
println calc.operate {i,j->i+j}
println calc.operate {i,j->i-j}
println calc.operate {i,j->i*j}
println calc.operate {i,j->i/j}