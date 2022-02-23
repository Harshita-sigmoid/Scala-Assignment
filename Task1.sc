def findBucketise(input: Float, start: Float, diff: Float): (Float, Float) = {
  (start + ((input/diff).floor) * diff, (start + ((input/diff).floor) * diff + 0.049F))
}

println(findBucketise(12.05F, 0.0F, 0.05F)) // (12.05, 12.099)
println(findBucketise(12.03F, 0.0F, 0.05F)) // (12.05, 12.099)
println(findBucketise(10.33F, 0.0F, 0.05F)) // (10.3, 10.349)
println(findBucketise(11.45F, 0.0F, 0.05F)) // (11.45, 11.499)
println(findBucketise(13.50F, 0.0F, 0.05F)) // (13.5, 13.549)