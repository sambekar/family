$(document).ready(function() {
    $('#persondetails').DataTable( {
        "processing": false,
        "serverSide": false,
        "ajax": {"url":"../getAllPersons","dataSrc":""},
        "columns" : [
        {"data":"id"},
        {"data":"firstname"},
        {"data":"middlename"},
        {"data":"lastname"},
        {"data":"gender"},
        {"data":"dateofbirth" },
        {"data":"otherdetails"},
        { "mRender": function (data, type, row) { return '<a class="table-edit" data-id="' + id + '">EDIT</a>'}},
        { "mRender": function (data, type, row) { return '<a class="table-delete" data-id="' + id + '">DELETE</a>'}}
         ]
    } );
} );