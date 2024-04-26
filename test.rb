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

def tor(num)
  if num < 1
    return 0
  elsif num == 2
    return 1
  else
    tor(num - 1) + tor(num - 2) + tor(num - 3)
  end
end

puts tor(10)

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

(1..5).each do |num|
  puts num
end