GRAPH QL Example

Postman requests:
for create book 
POST http://localhost:8009/graphql
Payload: mutation {
    createBook(book:{
        title:"jc",
        desc:"ukugku",
        price:4567,
        pages:123,
        author:"ghchc"
    }) {
        id
    }
}

Response:
{
    "data": {
        "createBook": {
            "id": "4"
        }
    }
}


For getBook
POST http://localhost:8009/graphql

Body: query {
    getBook(bookId:2) {
        id
        title
        author

    }
}

Response:
{
    "data": {
        "getBook": {
            "id": "2",
            "title": "Book2",
            "author": "Author2"
        }
    }
}



for getAllBooks:
POST http://localhost:8009/graphql
payload:
query {
    allBooks {
        id
        title

    }
}

Response:
{
    "data": {
        "allBooks": [
            {
                "id": "1",
                "title": "Book1"
            },
            {
                "id": "2",
                "title": "Book2"
            },
            {
                "id": "3",
                "title": "Book3"
            }
        ]
    }
}
