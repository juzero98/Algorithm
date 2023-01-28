def solution(N, stages):
    # 실패율 = 스테이지 도달했으나 클리어 못한 플레이어 수 / 스테이지 도달한 플레이어 수
    
    # 도달했지만 클리어 못한 플레이어 수
    arr1 = [0 for i in range(N)]
    # 도달한 플레이어 수
    arr2 = [0 for i in range(N)]
    
    for stg in stages :
        # 모든 스테이지 클리어일 경우
        if stg == N + 1 :
            for i in range(stg-1) :
                arr2[i] = arr2[i] + 1
        # 모든 스테이지 클리어가 아닐 경우
        else :
            # 1~현재스테이지까지 arr2++
            for i in range(stg) :
                arr2[i] = arr2[i] + 1
            # 현재스테이지 arr1++
            arr1[stg-1] = arr1[stg-1] + 1
    
    # 실패율 (딕셔너리)
    rates = {}
    for i in range(N) :
        # 도달한 유저가 없을 때, 0 처리
        if arr2[i] == 0 :
            rates[i+1] = 0 
            continue
        # 실패율 계산
        rates[i+1] = arr1[i] / arr2[i]

    # 실패율 내림차순 계산 (sorted()는 리스트로 반환됨)
    rates = sorted(rates.items(), key= lambda x : x[1], reverse=True)
    
    answer = []
    for i in range(N) :
        answer.append(rates[i][0])
    
    return answer
