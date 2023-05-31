axios.get('http://localhost:8096/jobs')
.then(function (response) {
    foo = response.data.map(doc => Object.values(doc));
    var row = document.getElementById("row");
    for(var i=0;i<foo.length;i++){
        var text ='<div data-job-id="856788" data-job-position="856788"
        class="col-md-4 col-sm-6 feature-job job-ta">
        <div class="feature-job-item">
            <div class="cvo-flex"><a
                    href="https://www.topcv.vn/viec-lam/chuyen-vien-tu-van-tuyen-sinh-he-dai-hoc-thu-nhap-tu-10-25tr-thang/856788.html?ta_source=BoxFeatureJob"
                    target="_blank" tabindex="-1">
                    <div class="box-company-logo"><img
                            src="https://cdn.topcv.vn/44/company_logos/cong-ty-cp-cong-nghe-giao-duc-truong-hoc-truc-tuyen-6093656d3cb5d.jpg"
                            alt="CÔNG TY CP CÔNG NGHỆ GIÁO DỤC TRƯỜNG HỌC TRỰC TUYẾN"
                            class="img-responsive lazy"></div>
                </a>
                <div class="col-title cvo-flex-grow"><a
                        data-toggle="tooltip"
                        data-original-title="Chuyên Viên Tư Vấn Tuyển Sinh - Hệ Đại Học - Thu Nhập Từ 10-25Tr/Tháng"
                        data-placement="top"
                        href="https://www.topcv.vn/viec-lam/chuyen-vien-tu-van-tuyen-sinh-he-dai-hoc-thu-nhap-tu-10-25tr-thang/856788.html?ta_source=BoxFeatureJob"
                        target="_blank" class="title text_ellipsis"
                        tabindex="-1">
                             <strong
                            class="transform-job-title underline-box-job"
                            style="font-weight: bold;">
                            Chuyên Viên Tư Vấn Tuyển Sinh - Hệ Đại Học - Thu
                            Nhập Từ 10-25Tr/Tháng
                        </strong>
                    </a> <a
                        href="https://www.topcv.vn/cong-ty/cong-ty-cp-cong-nghe-giao-duc-truong-hoc-truc-tuyen/63277.html"
                        target="_blank" data-toggle="tooltip" title=""
                        data-placement="top" data-container="body"
                        class="text-silver company text_ellipsis underline-box-job"
                        data-original-title="CÔNG TY CP CÔNG NGHỆ GIÁO DỤC TRƯỜNG HỌC TRỰC TUYẾN"
                        tabindex="-1">
                        CÔNG TY CP CÔNG NGHỆ GIÁO DỤC TRƯỜNG HỌC TRỰC TUYẾN
                    </a></div>
                <div class="col-like"><button data-id="856788"
                        class="save-job btn-outline-hover" tabindex="-1"><i
                            class="fa-regular fa-heart icon-first"></i> <i
                            class="fa-solid fa-heart icon-last"></i></button>
                </div>
            </div>
            <div class="col-job-info">
                <div class="salary text_ellipsis">6-15 triệu
                </div>
                <div data-toggle="tooltip" data-html="true" title=""
                    data-placement="top" data-container="body"
                    class="address text_ellipsis"
                    data-original-title="<p style='text-align: left'>Hà Nội: Thanh Xuân<br/>Hồ Chí Minh: Bình Thạnh</p>">
                    Hà Nội, Hồ Chí Minh
                </div>
            </div>
        </div>
    </div>'
    }

}
.catch(function (error) {
    console.log(error);
}));