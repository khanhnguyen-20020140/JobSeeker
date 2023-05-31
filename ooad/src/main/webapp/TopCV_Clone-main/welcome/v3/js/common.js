$(function() {
    $.ajaxSetup({
        headers: {
            'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
        }
    });
    if ($.cookie("popup-ebook-cv") != 1) {
        $.cookie("popup-ebook-cv", 1, {
            expires: 1
        });
    }
});
$('#topbar-event .topbar-close').click(function(event) {
    $('#topbar-event').slideUp('fast');
});