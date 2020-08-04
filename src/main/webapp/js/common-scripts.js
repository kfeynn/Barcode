var Script = function () {



//    sidebar dropdown menu

    jQuery('#sidebar .sub-menu > a').click(function () {
		var parent = jQuery(this).parent().parent();
		if(parent[0].className != 'sub-sidebar'){
			var child = jQuery('.sub-sidebar-menu.open', $('#sidebar'));
			child.removeClass("open");
			jQuery('.arrow', child).removeClass("open");
			var sub_sidebar = jQuery('.sub-sidebar', $('#sidebar'));
			if (sub_sidebar.is(":visible")) {
				//jQuery('.arrow', jQuery(this)).removeClass("open");
				//jQuery(this).parent().removeClass("open");
				sub_sidebar.slideUp(200);
			} else {
				//jQuery('.arrow', jQuery(this)).addClass("open");
				//jQuery(this).parent().addClass("open");
				//sub_sidebar.slideDown(200);
			}
		}
		
        //jQuery('.sub-menu', child).slideUp(200);
        /*var sub_child = jQuery(this).next();
		if (sub_child.is(":visible")) {
			jQuery('.arrow', jQuery(this)).removeClass("open");
			//jQuery(this).parent().removeClass("open");
			sub_child.slideUp(200);
		} else {
			jQuery('.arrow', jQuery(this)).addClass("open");
			//jQuery(this).parent().addClass("open");
			sub_child.slideDown(200);
		}*/
		
        var last = jQuery('.sub-menu.open', $('#sidebar'));
        last.removeClass("open");
        jQuery('.arrow', last).removeClass("open");
        jQuery('.sub', last).slideUp(200);
        var sub = jQuery(this).next();
		if (sub.is(":visible")) {
			jQuery('.arrow', jQuery(this)).removeClass("open");
			jQuery(this).parent().removeClass("open");
			sub.slideUp(200);
		} else {
			jQuery('.arrow', jQuery(this)).addClass("open");
			jQuery(this).parent().addClass("open");
			sub.slideDown(200);
		}
		
        var o = ($(this).offset());
        diff = 200 - o.top;
        if(diff>0)
            $("#sidebar").scrollTo("-="+Math.abs(diff),500);
        else
            $("#sidebar").scrollTo("+="+Math.abs(diff),500);
    });
	
	jQuery('#sidebar .sub-sidebar-menu > a').click(function () {
		var child = jQuery('.sub-menu.open', $('#sidebar'));
		child.removeClass("open");
		jQuery('.arrow', child).removeClass("open");
		jQuery('.sub', child).slideUp(200);
		var sub_sidebar = jQuery('.sub', child);
		if (sub_sidebar.is(":visible")) {
			jQuery('.arrow', child).removeClass("open");
			child.parent().removeClass("open");
			sub_sidebar.slideUp(200);
		} else {
			//jQuery('.arrow', jQuery(this)).addClass("open");
			//jQuery(this).parent().addClass("open");
			//sub_sidebar.slideDown(200);
		}
		
		
        var last = jQuery('.sub-sidebar-menu.open', $('#sidebar'));
        last.removeClass("open");
        jQuery('.arrow', last).removeClass("open");
        jQuery('.sub-menu', last).slideUp(200);
        var sub = jQuery(this).next();
		if (sub.is(":visible")) {
			sub.find("li").css({'display':'none'});
			jQuery('.arrow', jQuery(this)).removeClass("open");
			jQuery(this).parent().removeClass("open");
			sub.slideUp(200);
		} else {
			sub.find("li").css({'display':'block'});
			jQuery('.arrow', jQuery(this)).addClass("open");
			jQuery(this).parent().addClass("open");
			sub.slideDown(200);
		}
		
        var o = ($(this).offset());
        diff = 200 - o.top;
        if(diff>0)
            $("#sidebar").scrollTo("-="+Math.abs(diff),500);
        else
            $("#sidebar").scrollTo("+="+Math.abs(diff),500);
    });

//    sidebar toggle


    $(function() {
        function responsiveView() {
            var wSize = $(window).width();
            if (wSize <= 768) {
                $('#container').addClass('sidebar-close');
                $('#sidebar > ul').hide();
            }

            if (wSize > 768) {
                $('#container').removeClass('sidebar-close');
                $('#sidebar > ul').show();
            }
        }
        $(window).on('load', responsiveView);
        $(window).on('resize', responsiveView);
    });

    $('.icon-reorder').click(function () {
        if ($('#sidebar > ul').is(":visible") === true) {
            $('#main-content').css({
                'margin-left': '0px'
            });
            $('#sidebar').css({
                'margin-left': '-180px'
            });
            $('#sidebar > ul').hide();
            $("#container").addClass("sidebar-closed");
        } else {
            $('#main-content').css({
                'margin-left': '180px'
            });
            $('#sidebar > ul').show();
            $('#sidebar').css({
                'margin-left': '0'
            });
            $("#container").removeClass("sidebar-closed");
        }
    });

// custom scrollbar
    $("#sidebar").niceScroll({styler:"fb",cursorcolor:"#e8403f", cursorwidth: '3', cursorborderradius: '10px', background: '#404040', cursorborder: ''});

    $("html").niceScroll({styler:"fb",cursorcolor:"#e8403f", cursorwidth: '6', cursorborderradius: '10px', background: '#404040', cursorborder: '', zindex: '1000'});

// widget tools

    jQuery('.widget .tools .icon-chevron-down').click(function () {
        var el = jQuery(this).parents(".widget").children(".widget-body");
        if (jQuery(this).hasClass("icon-chevron-down")) {
            jQuery(this).removeClass("icon-chevron-down").addClass("icon-chevron-up");
            el.slideUp(200);
        } else {
            jQuery(this).removeClass("icon-chevron-up").addClass("icon-chevron-down");
            el.slideDown(200);
        }
    });

    jQuery('.widget .tools .icon-remove').click(function () {
        jQuery(this).parents(".widget").parent().remove();
    });

//    tool tips

    $('.tooltips').tooltip();

//    popovers

    $('.popovers').popover();



// custom bar chart

    if ($(".custom-bar-chart")) {
        $(".bar").each(function () {
            var i = $(this).find(".value").html();
            $(this).find(".value").html("");
            $(this).find(".value").animate({
                height: i
            }, 2000)
        })
    }


//custom select box

//    $(function(){
//
//        $('select.styled').customSelect();
//
//    });



}();