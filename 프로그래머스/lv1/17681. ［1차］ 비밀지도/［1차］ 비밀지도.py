def solution(n, arr1, arr2):
    array = [[0 for i in range(n)] for j in range(n)] # n*n 이차원리스트 초기화
    
    toBin = '0' + str(n) + 'b' # 이진수 변환을 위한 포맷 (n만큼 길이를 맞추기 위함)
    for i in range(n) :
        bin = format(arr1[i], toBin)
        for j in range(0, n) :
            array[i][j] = bin[j]
            
    for i in range(n) :
        bin = format(arr2[i], toBin)
        for j in range(0, n) :
            if array[i][j] == '1' or bin[j] == '1' : # 둘 중 하나라도 1이면 1로 설정
                array[i][j] = '1'
    
    answer = []
    for i in range(n) :
        answer.append(''.join(array[i]).replace("1","#").replace("0"," ")) # 1-># 0->공백
        
    return answer