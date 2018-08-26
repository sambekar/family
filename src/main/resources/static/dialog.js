$( function() {
    $( "#dialog" ).dialog({
      autoOpen: false,
       modal: true,
       width: 700,
       height:300,
      show: {
        effect: "blind",
        duration: 1000
      },
      hide: {
        effect: "explode",
        duration: 1000
      }
    });

    $( "#opener" ).on( "click", function() {
      $( "#dialog" ).dialog( "open" );
    });
  } );