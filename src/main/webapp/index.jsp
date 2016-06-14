<section id="main-content">
    <section class="wrapper">
        <!-- page start-->
        <section class="panel">
            <div class="panel-heading">
                <ul class="breadcrumb">
                    <li class="active">New Order</li>
                </ul>
            </div>

            <div class="panel-body" ng-controller="saveOrder">
                <form class="form-horizontal" name="form" ng-submit="save()" role="form">
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Customer Name</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="text" class="form-control" ng-model="order.customerName" placeholder=" " required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Customer Contact</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="tel" class="form-control" ng-model="order.customerContact" placeholder=" " required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">CustomerE-mail</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="email" class="form-control" ng-model="order.customerEmail" placeholder=" " required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Turf Variety</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="text" class="form-control" ng-model="order.turfVariety" placeholder=" " required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Turf Quantity</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="number" class="form-control" ng-model="order.turfQuantity" placeholder=" " required>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Cutter</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <select class="form-control" ng-model="order.cutter" required>
                                <option value="Free Trail">Free Trail</option>
                                <option value="Enterprise">Enterprise</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Driver</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <select class="form-control" ng-model="order.driver" required>
                                <option value="Free Trail">Free Trail</option>
                                <option value="Enterprise">Enterprise</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Layer</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <select class="form-control" ng-model="order.layer" required>
                                <option value="Free Trail">Free Trail</option>
                                <option value="Enterprise">Enterprise</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Total Price</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="number" class="form-control" ng-model="order.totalPrice" placeholder=" " required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label">Address Details</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="text" class="form-control" placeholder=" " ng-model="order.address" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 col-md-3 col-sm-3 control-label"> Expect Delivery Date</label>
                        <div class="col-lg-6 col-md-7 col-sm-8">
                            <input type="datetime" class="form-control" placeholder=" " ng-model="order.expectDeliveryDate" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-lg-offset-2 col-md-offset-3 col-sm-offset-3 col-lg-10 col-md-9 col-sm-9">
                            <button type="submit" class="btn btn-success">Save</button>
                            <button type="button" class="btn btn-default">Cancel</button>
                        </div>
                    </div>
                </form>
            </div>

        </section>
        <!-- page end-->
    </section>
</section>