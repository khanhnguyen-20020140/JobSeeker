$(document).ready(function() {
    function removeActivetoggle() {
        let now_active = $(".activeToggle");
        let menu_child = $(now_active).attr("menu-child");
        $(now_active).find(".toggle").toggleClass("cvo-hidden")
        $("#" + menu_child).slideToggle();
        let active_element_link = $(now_active).find("a")
        if (!active_element_link.hasClass("not-change")) {
            active_element_link.toggleClass("color-green")
            active_element_link.toggleClass("font-weight-bold")
        } else {
            active_element_link.toggleClass("color-green")
        }
        now_active.removeClass("activeToggle");
    }
    $(".btn-icon-parent").click(function() {
        if ($(this).hasClass("activeToggle")) {
            removeActivetoggle();
        } else {
            removeActivetoggle();
            let menu_child = $(this).attr("menu-child");
            $("#" + menu_child).slideToggle();
            $(this).find(".toggle").toggleClass("cvo-hidden")
            $(this).addClass("activeToggle")
            let element_link = $(this).find("a")
            if (!element_link.hasClass("not-change")) {
                element_link.toggleClass("color-green")
                element_link.toggleClass("font-weight-bold")
            } else {
                element_link.toggleClass("color-green")
            }
        }
    });
    $(".btn-icon-parent-home").click(function() {
        let menu_child = $(this).attr("menu-child");
        $("#" + menu_child).slideToggle();
        $(this).find(".toggle").toggleClass("cvo-hidden")
        let element_link = $(this).find("a")
        if (!element_link.hasClass("not-change")) {
            element_link.toggleClass("color-green")
            element_link.toggleClass("font-weight-bold")
        } else {
            element_link.toggleClass("color-green")
        }
    });
})