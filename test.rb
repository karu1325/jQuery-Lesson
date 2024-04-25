def fib(num)
  if num == 0
    return 0
  elsif num == 1
    return 1
  else
    fib(num - 1) + fib(num - 2)
  end
end

puts fib(10)

def count_number(number)
  list = []
  for i in 1.upto(number) do
    if (i % 7 == 0)
      list.append(i)
    end
  end
  list.sum{|i| i.to_s.count("7")}
end

puts count_number(7777777)

(1..20).each do |num|
  puts num
end