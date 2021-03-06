import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return goods with id[1, 2]"

    request {
        url "/api/goods"
        method GET()
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
        body '''
            [{
                "id"   : 1,
                "name" : "iPhone SE2",
                "price": 2095
            },
            {
                "id"   : 2,
                "name" : "iPhone X",
                "price": 5095
            }]
        '''
    }
}