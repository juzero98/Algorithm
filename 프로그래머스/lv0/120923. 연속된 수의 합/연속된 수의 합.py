def solution(num, total):
    answer = []
    
    # 기준점 n이 1 증가될 때마다 총합은 num씩 증가
    n = 1
    while True:
        result = sumAll(n, num)
        if result == total:
            for i in range(n, n + num):
                answer.append(i)
            break
        elif result < total:
            n += 1
        elif result > total:
            n -= 1
    
    return answer

def sumAll(n, num):
    sum = 0
    for i in range(n, n + num):
        sum += i
        
    return sum